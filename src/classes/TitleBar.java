package classes;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class TitleBar extends JPanel{
	// Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(400,80));
		//this.setBackground(Color.DARK_GRAY);
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200,80));
		//titleText.setBackground(Color.white);
		titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
		
	}
}
