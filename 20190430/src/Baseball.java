import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		String c="416";
		//무한반복
		Scanner sc=new Scanner(System.in);
		while(true) {
		String p = sc.nextLine();
		// strike, ball구하자
		boolean isEnd = play(p,c);

		if(isEnd == true) {
			System.out.println("HIT");
			break;
		}
	}
	}
	private static String makeComputer() {
		StringBuffer buffer = new StringBuffer();
		//1~9
		Random random = new Random();
		for(int i=0; i<3; i++) {
		int r = random.nextInt(9- 1 + 1) +1;
		String rString = String.valueOf(r);
		//StringBuffer 넣기전에 있는지 확인하자 
		if(!buffer.toString().contains(rString) == false) {
			buffer.append(rString);
			i++;
		}
		}
		return buffer.toString();
		}

	private static boolean play(String p, String c) {
		int strike =0;
		int ball = 0;
		//for i 사용자 인덱스 돌고
		for(int i=0; i<p.length();i++) {
			//for j 컴퓨터 인덱스 돌고
			for(int j=0; j<c.length();j++) {
			//if p[i] == c[i]
				if(p.charAt(i)==c.charAt(j)) {
					 if( i==j)   strike++;
					 else ball++;
				}	
			}
		}
			//p, strike ball 출력하자
			System.out.println(p+"\tstrike : "+strike+"\tball : "+ball);
			
			//p와c가 같을때,p와스트라이크 개수가 같을떙ㅋ
			//p.length()==strike
			if(p.equals(c)) {
				return true;
			}
		return false;
	}

}