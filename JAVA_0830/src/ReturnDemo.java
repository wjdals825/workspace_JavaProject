
public class ReturnDemo {

	public static void main(String[] args) {
		printScore (99);
	}
	
	public static void printScore(int score) {
          if(score<0 || score>100) {
        	   System.out.println("�߸��� ���� : "+ score);
          }
          
          System.out.println("���� : "+score)
	}

}
