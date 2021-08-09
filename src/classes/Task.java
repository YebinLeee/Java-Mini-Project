package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {
	
	private JLabel index; 
	private JTextField taskName; // 업무 제목
	private JButton done; // 업무 확인 버튼
	
	private boolean checked; // 업무 완료 유무
	
	// Constructor
	Task()
	{
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.magenta);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		
		taskName = new JTextField("업무를 여기다 적으세요!");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.lightGray);
		
		this.add(taskName, BorderLayout.CENTER);
		
		done = new JButton("완료");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		new AppFrame();
	}
}