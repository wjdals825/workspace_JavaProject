package swingdir2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestLogin extends JFrame {
	TestLogin() {
		setTitle("�α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();//����Ʈ��

		JPanel jp=new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(new JLabel("���̵�"));
		jp.add(new JTextField(10));
		jp.add(new JLabel("��й�ȣ"));
		jp.add(new JTextField(10));
		
		cp.add(jp, BorderLayout.CENTER);
		cp.add(new JButton("�α���"),BorderLayout.SOUTH);
		setSize(200,130);
		setVisible(true);
	}




	public static void main(String[] args) {
		new TestLogin();

	}

}