import java.util.Scanner;
//분을 입력받아
//초초 30분은 2000원, 10분당 1000원
//주차요금을 출력하자
//5->1500,30->1500,40->2500,41->3500
public class ParkingFee {

	public static void main(String[] args) {
		//분을 입력하자
		Scanner sc= new Scanner(System.in);
		int time = sc.nextInt()	;
		int fee = 0;
		if (time<=30) {
			//분 <= 30 이면, 1500
			fee=1500;
		} 
		else { 
			//아니고,
			//분=분-30, 요금 +=1500
			time = time - 30;
			fee += 1500;
			//요금 +=(분/10)*1000
			fee += (time/10)*1000;
			//분%10!=0면, 요금 +=1000
			if(time%10 != 0) {
				fee +=1000;
			}
		 }
		 System.out.println("주차요금은 "+fee+"원입니다.");
		 
			}
	
	}

