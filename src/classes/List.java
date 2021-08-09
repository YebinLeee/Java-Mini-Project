package classes;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{
	
	List(){
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
	}
	
}
