abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int [] a);
}

public class GoodCalculator extends Calculator {
	
	public static void main(String ar[]) {
		GoodCalculator c=new GoodCalculator();
		System.out.println(c.add(2, 3));
		System.out.println(c.substract (2,3));
		System.out.println(c.average(new int[] {2,3,4,}));
	}
}
