package classes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class ButtonPanel extends JButton{

	private JButton addTask;
	private JButton clear;
	
	// Constructor
	ButtonPanel()
	{
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.cyan);
	}
}
