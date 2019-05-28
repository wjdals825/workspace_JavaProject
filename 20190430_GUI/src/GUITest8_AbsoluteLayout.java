import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest8_AbsoluteLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("가위바위보 게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		panel.setLayout(null);
		JButton bt0 = new JButton("Button0");
		bt0.setBounds(10, 20, 100, 200);
		panel.add(bt0);
		JButton bt1 = new JButton("Button0");
		bt0.setBounds(10+100, 20, 100, 200);
		panel.add(bt1);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


