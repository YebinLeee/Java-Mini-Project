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
		JPanel panel = new JPanel(); // �г� �߰�. (������ �ȿ� ���� ���� �г� �߰� ����)
		JLabel label = new JLabel("MY JAVA MINI PROJECT. Welcome !"); // text ���� �߰�
		JButton btn1 = new JButton("Click Me!"); // ��ư �߰�
		JTextArea txtArea = new JTextArea();  // ���� ���� �ؽ�Ʈ �Է� (JTextField = �� ���� �ؽ�Ʈ �Է�)
		// JTextField txtField = new JTextField(200); // 
		
		JPanel btnPanel = new JPanel(); // ��ư���� ���� �г� �߰�
		JButton btn2 = new JButton("Exit"); // ���α׷��� �����ϴ� ��ư �߰�
		
		panel.setLayout(new BorderLayout()); // �г��� ���ϴ� Ư���� ��ġ�� �̵�
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label, BorderLayout.NORTH); // ���̺��� ���ʿ� �߰�
		panel.add(btnPanel, BorderLayout.WEST); // ��ư�� ���ʿ� �߰�
		panel.add(txtArea, BorderLayout.CENTER); // textArea�� ����� �߰�
		// panel.add(txtField, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent e) {
				//txtArea.append("You are amazing!\n");
				label.setText(txtArea.getText()); // txtArea���� �Է¹��� �ؽ�Ʈ�� ���̺��� ����
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // ���α׷� ����
				
			}
		});
		
		
		frame.add(panel); // �����ӿ� ��� �߰�
		
		frame.setResizable(false); // ����ڰ� ���Ƿ� ������ ������ ���� X
		frame.setVisible(true); // ���� �� ���������� ���� �� �ְ� ����
		frame.setPreferredSize(new Dimension(840, 8490/4*3)); // ���簢���� ����/���� ����
		frame.setSize(840, 840/4*3);
		frame.setLocationRelativeTo(null); // ����� �������� ��µǵ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷��� �������� �� ��� ���൵ ����ǵ���
	}
}