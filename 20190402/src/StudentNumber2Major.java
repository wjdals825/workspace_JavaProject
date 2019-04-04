import java.util.Scanner;

public class StudentNumber2Major {
	
	public static void main(String[] args) {
		//학번 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("학과를 구할 학번을 입력하세요.");
		String num=sc.nextLine();
		//System.out.println(num);
		String grade = num.substring(0,1);
		//char grade=num.charAt(0);
		String classroom=num.substring(1,2);
		char gradeCh = 0;
		if (grade.equals("1") || grade.equals("2")) {
			if (classroom.equals("1") || classroom.equals ("2")) {
				System.out.println("뉴미디어소프트웨어과");
				}
			else if (classroom.equals("3") || classroom.equals("4")) {
				System.out.println("뉴미디어웹솔루션과");
			   } 
			else if (classroom.equals("5") || classroom.equals("6")) {
				System.out.println("뉴미디어디자인과");
		       
			}}
		    else if (gradeCh == '3') {
		    	int classroomCh = 0;
				switch(classroomCh) {
		    	case '1' :
		    	case '2' :
		    			System.out.println("인터랙티브미디어과");
		    			break;
		    	case '3' :
		    	case '4' :
		    			System.out.println("뉴미디어디자인과");
		    			break;
		    	case '5' :
		    	case '6' :
		    			System.out.println("뉴미디어솔루션과");
		    			break;
		    	}
		    }

	}

}
