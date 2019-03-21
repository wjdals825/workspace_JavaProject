import java.util.Scanner;

public class test1 {
	
	public static void main (String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		switch (a) {
		case 1 : 
			System.out.println("아주 잘했습니다.");
		case 2 :
		case 3 :
			System.out.println("잘했습니다.");
		case 4 :
		case 5 :
		case 6 :
			System.out.println("보통입니다.");
		}
		
	}

}
