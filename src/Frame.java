import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); // ������ �ȿ� ���� ���� �г� �߰� ����
		
		frame.add(panel);
		
		panel.add(new JLabel("Welcome to this Project! I'm Yebin :) "));
		frame.setResizable(false); // ����ڰ� ���Ƿ� ������ ������ ���� X
		frame.setVisible(true); // ���� �� ���������� ���� �� �ְ� ����
		frame.setPreferredSize(new Dimension(840, 8490/4*3)); // ���簢���� ����/���� ����
		frame.setSize(840, 840/4*3);
		frame.setLocationRelativeTo(null); // ����� �������� ��µǵ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷��� �������� �� ��� ���൵ ����ǵ���
	}
}