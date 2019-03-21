package swingdir;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
class MyFrame extends JFrame{
	MyFrame(){
		setTitle("연습용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new FlowLayout()); 
		add(new JButton("버튼임1"), BorderLayout.EAST);
		add(new JButton("버튼임2"),  BorderLayout.WEST);
		add(new JButton("버튼임3"),  BorderLayout.NORTH);
		add(new JButton("버튼임4"),  BorderLayout.SOUTH);
		add(new JButton("버튼임5"),  BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
}
public class FrameTest {

	public static void main(String[] args) {
		MyFrame obj=new MyFrame();

	}

}
