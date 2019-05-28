import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUITest5_ImageCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			frame.setPreferredSize(new Dimension(400,600));
			
			ImageIcon hc = new ImageIcon("src/images/77.jpg");
			JLabel imageLabel = new JLabel(hc);
			
			ImageIcon luv = new ImageIcon("src/images/rrr.jpg");
		
			
			ImageIcon smallluv = new ImageIcon(luv.getImage().
					getScaledInstance( 200, 200, Image.SCALE_DEFAULT));	
					JButton imageButton = new JButton(smallluv);
					imageButton.setRolloverIcon(hc);
					imageButton.setPressedIcon(luv);
			
			panel.add(imageLabel);
			panel.add(imageButton);
			frame.add(panel);

		frame.add(panel);
			
			frame.pack();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
