package classes;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class TitleBar extends JPanel{
	
	// Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(300,80));
		this.setBackground(Color.gray);
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200,80));
		titleText.setFont(new Font("IMÇý¹Î Regular", Font.BOLD, 30));
		titleText.setForeground(Color.white);
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
		
	}
}