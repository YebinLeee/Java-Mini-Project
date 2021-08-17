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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� �� ���α׷��� �Բ� ����
		this.setVisible(true);
		this.setLocationRelativeTo(null); // ����� �������� ��µǵ��� ����
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
				list.updateNumbers(); // Task �߰� �� index Numbers ������Ʈ
				
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
							System.out.println(i + "��° ����");
							list.updateNumbers();
							list.repaint();
						}
					}
				}
			}
		});
	}
}

