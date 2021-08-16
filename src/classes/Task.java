package classes;

import java.awt.*;
import javax.swing.*;

public class Task extends JPanel {
	
	// private String[] tasks={"Java", "Algorithm Study", "ML Study", "Python", "Hobby", "School Work"};
	
	private JLabel index; 
	private JTextField taskName; // 업무 제목
	// private JList<String> taskList;
	private JLabel timer;
	private JButton done; // 업무 확인 버튼
	
	private boolean checked; // 업무 완료 유무
	
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
		
		
		taskName = new JTextField(null);
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setFont(new Font("IM혜민 Regular", Font.PLAIN, 15));
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
		done.setFont(new Font("IM혜민 Regular", Font.BOLD, 12));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
		
		timer = new JLabel();
		
	}
	
	public JButton getDone() {
		return done;
	}
	
	// 각 업무의 인덱스 변경
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

