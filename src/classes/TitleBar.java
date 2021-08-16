package classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel{
	
	// Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(300,80));
		this.setBackground(new Color(189, 234, 252));
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200,80));
		titleText.setFont(new Font("IMÇý¹Î Regular", Font.BOLD, 30));
		titleText.setForeground(Color.black);
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
		
	}
}