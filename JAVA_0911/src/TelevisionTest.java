
public class TelevisionTest {
	public static void main(String[] args) {
		Television1 myTv=new Television1();
		myTv.channel=7;
		myTv.volume=10;
		myTv.onOff=true;
		myTv.print();
		int ch=myTv.getChannel();
		System.out.println("���� ä����"+ch+"�Դϴ�");

	}

}
