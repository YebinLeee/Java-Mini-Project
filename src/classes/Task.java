package classes;

import java.awt.*;
import javax.swing.*;

public class Task extends JPanel {

	private JLabel index; 
	private JTextField taskName; // ���� ����
	private JButton done; // ���� Ȯ�� ��ư
	private boolean checked; // ���� �Ϸ� ����
	
	private Stopwatch timerPanel; // Ÿ�̸� �г�
	
	// Constructor
	Task()
	{
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(new Color(0, 124, 173));
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		index.setForeground(Color.white);
		
		this.add(index,BorderLayout.WEST);
		
		
		taskName = new JTextField("   ");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setFont(new Font("IM���� Regular", Font.PLAIN, 20));
		taskName.setBackground(new Color(232, 232, 232));
		
		
		this.add(taskName, BorderLayout.CENTER);
	
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setFont(new Font("IM���� Regular", Font.BOLD, 12));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(new Color(102, 102, 102));
		done.setForeground(Color.white);
		
		this.add(done, BorderLayout.EAST);
		
		
		/* timer, stopwatch Panel */
		
		timerPanel = new Stopwatch();
		timerPanel.setBorder(BorderFactory.createEmptyBorder());
		timerPanel.setBackground(Color.white);
		this.add(timerPanel, BorderLayout.SOUTH);
	}
	
	public JButton getDone() {
		return done;
	}
	
	// �� ������ �ε��� ����
	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
	}
	
	// done ��ư ���� �� ���� �ٲٱ�
	public void changeState()
	{
		this.setBackground(new Color(240, 240, 240));
		taskName.setBackground(Color.black);
		taskName.setForeground(Color.orange);
		checked = true;
	}
	
	public boolean getChecked() {
		return this.checked;
	}
}

