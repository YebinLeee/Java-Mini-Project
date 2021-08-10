package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Task extends JPanel {
	
	private String[] tasks={"Java", "Algorithm", "Python", "MyHobby", "Game", "Youtube", "Study"};
	
	private JLabel index; 
	private JTextField taskName; // ���� ����
	private JList<String> taskList;
	private JButton done; // ���� Ȯ�� ��ư
	
	private boolean checked; // ���� �Ϸ� ����
	
	// Constructor
	Task()
	{
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.yellow);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(index,BorderLayout.WEST);
		
		
		taskName = new JTextField("���⿡ �Է��ϼ���");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setFont(new Font("IM���� Regular", Font.PLAIN, 15));
		taskName.setBackground(Color.LIGHT_GRAY);
		
		
		this.add(taskName, BorderLayout.CENTER);
	
		
		/* 
		taskList = new JList<String>(tasks);
		taskList.setPreferredSize(new Dimension(20,40));
		taskList.setBorder(BorderFactory.createEmptyBorder());
		this.add(new JScrollPane(taskList), BorderLayout.NORTH);
		*/
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setFont(new Font("IM���� Regular", Font.BOLD, 12));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
	}
	
	// "done" ��ư ���� �� ����
	public JButton getDone() {
		return done;
	}
	
	// �� ������ �ε��� ����
	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
	}
	
	// 
	public void changeState()
	{
		this.setBackground(Color.pink);
		taskName.setBackground(Color.black);
		taskName.setForeground(Color.LIGHT_GRAY);
		checked = true;
	}

}

