package swingdir;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
class MyFrame extends JFrame{
	MyFrame(){
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new FlowLayout()); 
		add(new JButton("��ư��1"), BorderLayout.EAST);
		add(new JButton("��ư��2"),  BorderLayout.WEST);
		add(new JButton("��ư��3"),  BorderLayout.NORTH);
		add(new JButton("��ư��4"),  BorderLayout.SOUTH);
		add(new JButton("��ư��5"),  BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
}
public class FrameTest {

	public static void main(String[] args) {
		MyFrame obj=new MyFrame();

	}

}
