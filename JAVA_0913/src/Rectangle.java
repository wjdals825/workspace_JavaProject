import java.util.Scanner;
  class Rectangle{
    int width;
    int height;
    public int getArea() {
    	return width*height;
	}
  }
		
		public class RectApp{
			public static void main (String[] args) {
				Rectangle rect = new Rectangle();
				Scanner scanner=new Scanner(System.in);
				System.out.print(">> ");
				rect.width=scanner.nextInt();
				rect.height=scanner.nextInt();
				int area=rect.getArea();
				System.out.println("�簢���� ������"+area);
			}
		}

