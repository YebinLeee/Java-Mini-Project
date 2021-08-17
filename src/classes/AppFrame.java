package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame{
	
	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;
	
	JButton addTask; 
	JButton clear;
	
	// Constructor
	AppFrame()
	{
		this.setTitle("ToDo List");
		
		//this.setResizable(false);
		//this.setPreferredSize(new Dimension(400,700));
		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 프로그램도 함께 종료
		this.setVisible(true);
		this.setLocationRelativeTo(null); // 가운데에 프레임이 출력되도록 설정
		this.setLayout(new BorderLayout());
		
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
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{
			
				Component[] listItems = list.getComponents();
				
				for(int i=0;i<listItems.length;i++)
				{
					if(listItems[i] instanceof Task)
					{
						if (((Task) listItems[i]).getChecked() == true) {
							list.remove(listItems[i]);
							System.out.println(i + "번째 제거");
							list.updateNumbers();
							list.repaint();
						}
					}
				}
			}
		});
	}
}

