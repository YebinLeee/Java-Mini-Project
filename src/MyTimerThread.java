import javax.swing.*;
import java.awt.*;

// Runnable �������̽��� �����ϴ� Ÿ�̸� ������ TimerRunnable
class TimerRunnable implements Runnable{
	private JLabel timerLabel; // Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; // Ÿ�̸� ī��Ʈ ����ϴ� ���̺�
	}
	
	// ������ �ڵ�. run() �����ϸ� ������ ����
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
}

// start, stop ��ư�� ���� ButtonPannel
class ButtonPanel extends JPanel{
	private JButton startButton;
	private JButton stopButton;
	
	Border emptyBorder= BorderFactory.createEmptyBorder();
	
	// Constructor
	ButtonPanel()
	{
		this.setLayout(new FlowLayout());
		//this.setPreferredSize(new Dimension(300,60));
		this.setBackground(Color.gray);
		
		startButton = new JButton("START");
		startButton.setBorder(emptyBorder);
		startButton.setFont(new Font("IM���� Regular", Font.PLAIN, 20));
		startButton.setBackground(Color.RED);
		
		this.add(startButton);
		this.add(Box.createHorizontalStrut(30));
		
		stopButton = new JButton("STOP");
		stopButton.setBorder(emptyBorder);
		stopButton.setFont(new Font("IM���� Regular", Font.PLAIN, 20));
		stopButton.setBackground(Color.GREEN);
		
		this.add(stopButton);
	}
	
	public JButton getStart() {
		return startButton;
	}
	
	public JButton getStop() {
		return stopButton;
	}
	

}

public class MyTimerThread extends JFrame{
	
	private ButtonPanel btnPanel;
	
	private JButton startBtn;
	private JButton stopBtn;
	
	public MyTimerThread() {
		setTitle("My Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// Ÿ�̸� �� ����ϴ� �г� ����
		JPanel timerPanel = new JPanel();
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("IM����ü", Font.ITALIC, 80));
		timerPanel.add(timerLabel, BorderLayout.CENTER);
		c.add(timerPanel, BorderLayout.CENTER);
		
		// Ÿ�̸� ������� ����� Runnable ��ü ����
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(250, 200);
		setVisible(true);
		
		// start, stop ��ư�� �ִ� btnPannel
		btnPanel = new ButtonPanel();
		startBtn = btnPanel.getStart();
		stopBtn = btnPanel.getStop();
		
		c.add(btnPanel, BorderLayout.SOUTH);
		
		th.start(); // ������ ����
	}
	
	public static void main(String[] args) {
		new MyTimerThread();
	}
}
