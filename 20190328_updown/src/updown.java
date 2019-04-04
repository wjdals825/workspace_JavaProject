import java.util.Scanner; 

public class updown { 
     public static void main(String[] args) { 
     int rn = (int)(Math.random()*100) +1; 
     Scanner sc = new Scanner(System.in); 

          while(true){ 
               System.out.print("숫자 입력 >");
               int a = sc.nextInt(); 
               if(rn ==a){ 
                    System.out.println("정답입니다.");
                    System.exit(0); 
               }
               else if(rn != a && rn < a){ 
                    System.out.println("up");        
               }
               else if(rn != a && rn > a){ 
                    System.out.println("down"); 
                   
               } 
          } 
     }
}