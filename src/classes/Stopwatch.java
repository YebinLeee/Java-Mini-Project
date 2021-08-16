package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Stopwatch extends JButton implements ActionListener {
	
	// global variables and objects

	JButton startButton = new JButton("START");
	JButton resetButton = new JButton("RESET");
	JLabel timeLabel = new JLabel();
	
	int elapsedTime = 0; // milliseconds unit
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	
	// seconds, minutes, hours�� string���� ǥ��(00���� ����)
	String seconds_string = String.format("%02d", seconds); 
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	// 1 second(value:1000)
	Timer timer = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			elapsedTime += 1000; // 1�� �߰�
			hours = (elapsedTime/3600000);
			minutes = (elapsedTime/60000) % 60;
			seconds = (elapsedTime/1000) % 60;
			
			seconds_string = String.format("%02d", seconds); 
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			
			timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		}
	});
	
	boolean started = false;
	
	// Constructor
	Stopwatch(){
		
		// ��, ��, �� Text
		timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		timeLabel.setFont(new Font("IM����ü", Font.PLAIN, 20));
		timeLabel.setBorder(BorderFactory.createEmptyBorder());
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		timeLabel.setBackground(null);
		
		// start/stop ��ư
		startButton.setFont(new Font("IM����ü", Font.ITALIC, 10));
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		
		// reset ��ư
		resetButton.setFont(new Font("IM����ü", Font.ITALIC, 10));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		resetButton.setBackground(Color.black);
		resetButton.setForeground(Color.white);
		
		this.setLayout(new FlowLayout());
		this.add(timeLabel);
		this.add(startButton);
		this.add(resetButton);				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// startButton�� ���� action (started�� ���� ���� start/stop)
		if(e.getSource()==startButton) {
			if(started==false) {
				started=true;
				startButton.setText("STOP");
				start();
			}
			else {
				started=false;
				startButton.setText("START");
				stop();
			}
		}
		
		// resetButton�� ���� action
		if(e.getSource()==resetButton) {
			started=false;
			startButton.setText("START");
			reset();
		}
		
	}
	
	void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	
	void reset() {
		timer.stop();
		// ��� value�� 0���� �缳��
		elapsedTime=0;
		minutes=0;
		hours=0;
		seconds=0;
		
		seconds_string = String.format("%02d", seconds); 
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		
		timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
	}
	
}
