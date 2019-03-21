class Box{
	int width;
	int length;
	int height;
}
	
public class BoxTest {
	public static void main(String[] args) {
		
		Box bt=new Box();
		bt.width=20;
		bt.length=20;
		bt.height=20;
		System.out.println("박스의 가로,세로,높이의 길이는 "+bt.width+" , "+bt.length+" , "+bt.height+" 입니다. ");

	}

}
