interface AdderInterface {
	int add(int x, int y);
	int add(int n);
}
public class MyAdder extends AdderInterface {
	public static void main (String ar[]) {
		MyAdder adder=new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
