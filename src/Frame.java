import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); // 프레임 안에 여러 개의 패널 추가 가능
		
		frame.add(panel);
		
		panel.add(new JLabel("Welcome to this Project! I'm Yebin :) "));
		frame.setResizable(false); // 사용자가 임의로 프레임 사이즈 변경 X
		frame.setVisible(true); // 실행 후 가시적으로 보일 수 있게 설정
		frame.setPreferredSize(new Dimension(840, 8490/4*3)); // 직사각형의 가로/세로 설정
		frame.setSize(840, 840/4*3);
		frame.setLocationRelativeTo(null); // 가운데에 프레임이 출력되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료했을 때 모든 실행도 종료되도록
	}
}