package classes;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class AppFrame extends JFrame{
	
	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;
	
	// Constructor
	AppFrame()
	{
		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null); // ����� �������� ��µǵ��� ����
		
		title = new TitleBar();
		list = new List();
		btnPanel = new ButtonPanel();
		
		this.add(title, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);
	}
}
