import java.util.Scanner;

public class page {

	public static void main(String[] args) {
		//int nPerPage=7;
		//int result=331;
		//int 결과 = result/nPerPage+1;
		//if(result%nPerPage == 0) {
		//	결과 = result/nPerPage;
		//}
		//System.out.println(결과+"페이지가 필요합니다.");
		
		int nPerPage=7;
		System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요.)");
		Scanner scanner= new Scanner(System.in);
		int result=scanner.nextInt();
		int 결과 = result/nPerPage+1;
		if(result%nPerPage == 0) {
			결과 = result/nPerPage;
		}
		System.out.println(결과+"페이지가 필요합니다.");

	}

}