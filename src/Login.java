package practices;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10); // 패스워드
		
		/* ID, PW 입력 후 클릭 버튼 */
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// ID, PW 입력받아 텍스트 비교
				String id = "Yebin";
				String pw = "1234";
				
				// id, pw 모두 일치하는 경우 로그인 성공한 메세지 창 출력
				if(id.equals(txtID.getText()) && pw.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
				}
				// 로그인 실패 메세지
				else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		add(panel);
		
		setVisible(true); 
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Login();
	}
}

