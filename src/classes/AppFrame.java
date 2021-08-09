package classes;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppFrame extends JFrame{
	
	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;
	
	private JButton addTask; 
	private JButton clear;
	
	// Constructor
	AppFrame()
	{
		this.setTitle("ToDo List");
		
		// this.setResizable(false);
		this.setPreferredSize(new Dimension(400,700));
		this.setSize(400,700);
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
		addTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{
				Task task = new Task();
				list.add(task);
				list.updateNumbers(); // Task 추가 후 index Numbers 업데이트
				
				task.getDone().addMouseListener(new MouseAdapter()
				{
					@Override
					public void mousePressed(MouseEvent e)
					{
						task.changeState();
						revalidate();
					}
				});
				revalidate();
			}
		});
	}
}
