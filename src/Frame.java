import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
// import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); // 패널 추가. (프레임 안에 여러 개의 패널 추가 가능)
		JLabel label = new JLabel("MY JAVA MINI PROJECT. Welcome !"); // text 문구 추가
		JButton btn1 = new JButton("Click Me!"); // 버튼 추가
		JTextArea txtArea = new JTextArea();  // 여러 줄의 텍스트 입력 (JTextField = 한 줄의 텍스트 입력)
		// JTextField txtField = new JTextField(200); // 
		
		JPanel btnPanel = new JPanel(); // 버튼들을 넣을 패널 추가
		JButton btn2 = new JButton("Exit"); // 프로그램을 종료하는 버튼 추가
		
		panel.setLayout(new BorderLayout()); // 패널을 원하는 특정한 위치에 이동
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label, BorderLayout.NORTH); // 레이블을 위쪽에 추가
		panel.add(btnPanel, BorderLayout.WEST); // 버튼을 왼쪽에 추가
		panel.add(txtArea, BorderLayout.CENTER); // textArea를 가운데에 추가
		// panel.add(txtField, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent e) {
				//txtArea.append("You are amazing!\n");
				label.setText(txtArea.getText()); // txtArea에서 입력받은 텍스트로 레이블을 변경
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 종료
				
			}
		});
		
		
		frame.add(panel); // 프레임에 페널 추가
		
		frame.setResizable(false); // 사용자가 임의로 프레임 사이즈 변경 X
		frame.setVisible(true); // 실행 후 가시적으로 보일 수 있게 설정
		frame.setPreferredSize(new Dimension(840, 8490/4*3)); // 직사각형의 가로/세로 설정
		frame.setSize(840, 840/4*3);
		frame.setLocationRelativeTo(null); // 가운데에 프레임이 출력되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료했을 때 모든 실행도 종료되도록
	}
}