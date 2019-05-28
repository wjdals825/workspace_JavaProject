import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_가위바위보 {
	static String[] filename = {"src/images/scissors.png", "src/images/rock.png", "src/images/paper.png"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("가위바위보 게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButton = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon(filename[0]);
		JButton rockButton = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon(filename[0]);
		JButton paperButton = new JButton(paperImage);
		
		panel.add(result);
		panel.add(computerLabel);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
