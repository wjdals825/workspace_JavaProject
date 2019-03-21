package swingdir2;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class Test extends JFrame {
	Test(){
		setTitle("Let's Study JAVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(5,7));
		//레이아웃 변경(setLayout) 컴포넌트 추가(add)
		cp.add(new JButton("North"),BorderLayout.NORTH);
		cp.add(new JButton("South"),BorderLayout.SOUTH);
		cp.add(new JButton("West"),BorderLayout.WEST);
		cp.add(new JButton("East"),BorderLayout.EAST);
		cp.add(new JButton("Center"),BorderLayout.CENTER);
		setSize(400,200);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test obj = new Test();
		new Test();

	}

}
