package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.border.Border;

public class ButtonPanel extends JButton{

	private JButton addTask;
	private JButton clear;
	
	Border emptyBorder= BorderFactory.createEmptyBorder();
	
	// Constructor
	ButtonPanel()
	{
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.black);
		
		addTask = new JButton("할일 추가");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(addTask);
		
		this.add(Box.createHorizontalStrut(20));
		clear = new JButton("완료된 업무 모두 삭제하기");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		this.add(clear);
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
}
