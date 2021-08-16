package classes;

import java.awt.*;
import javax.swing.*;

public class List extends JPanel{

	List(){
		GridLayout layout = new GridLayout(5,1);
		layout.setVgap(10);
		layout.setHgap(5);
		
		this.setLayout(layout);
		this.setBackground(Color.white);
	}
	
	public void updateNumbers()
	{
		Component[] listItems = this.getComponents();
		
		for(int i=0;i<listItems.length;i++)
		{
			if(listItems[i] instanceof Task)
			{
				((Task)listItems[i]).changeIndex(i+1);
			}
		}
	}
}

