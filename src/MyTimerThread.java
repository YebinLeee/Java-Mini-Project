import javax.swing.*;
import java.awt.*;

// Runnable 인터페이스를 구현하는 타이머 스레드 TimerRunnable
class TimerRunnable implements Runnable{
	private JLabel timerLabel; // 타이머 값이 출력되는 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; // 타이머 카운트 출력하는 레이블
	}
	
	// 스레드 코드. run() 종료하면 스레드 종료
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

// start, stop 버튼을 가진 ButtonPannel
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
		startButton.setFont(new Font("IM혜민 Regular", Font.PLAIN, 20));
		startButton.setBackground(Color.RED);
		
		this.add(startButton);
		this.add(Box.createHorizontalStrut(30));
		
		stopButton = new JButton("STOP");
		stopButton.setBorder(emptyBorder);
		stopButton.setFont(new Font("IM혜민 Regular", Font.PLAIN, 20));
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
		
		// 타이머 값 출력하는 패널 생성
		JPanel timerPanel = new JPanel();
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("IM혜민체", Font.ITALIC, 80));
		timerPanel.add(timerLabel, BorderLayout.CENTER);
		c.add(timerPanel, BorderLayout.CENTER);
		
		// 타이머 스레드로 사용할 Runnable 객체 생성
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(250, 200);
		setVisible(true);
		
		// start, stop 버튼이 있는 btnPannel
		btnPanel = new ButtonPanel();
		startBtn = btnPanel.getStart();
		stopBtn = btnPanel.getStop();
		
		c.add(btnPanel, BorderLayout.SOUTH);
		
		th.start(); // 스레드 시작
	}
	
	public static void main(String[] args) {
		new MyTimerThread();
	}
}
