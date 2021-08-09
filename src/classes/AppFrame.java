package classes;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class AppFrame extends JFrame{
	
	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;
	
	private JButton addTask; 
	private JButton clear;
	
	// Constructor
	AppFrame()
	{
		this.setSize(400,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null); // 가운데에 프레임이 출력되도록 설정
		
		title = new TitleBar();
		list = new List();
		btnPanel = new ButtonPanel();
		
		this.add(title, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);
		
		addTask = btnPanel.getAddTask();
		clear = btnPanel.getClear();
		
		addListeners();
	}
	
	public void addListeners()
	{
		
	}
}
