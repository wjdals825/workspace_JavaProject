
public class ReturnDemo {

	public static void main(String[] args) {
		printScore (99);
	}
	
	public static void printScore(int score) {
          if(score<0 || score>100) {
        	   System.out.println("잘못된 정수 : "+ score);
          }
          
          System.out.println("정수 : "+score)
	}

}
