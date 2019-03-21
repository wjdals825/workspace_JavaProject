class Animal{
	void walk() {
		System.out.println("걸을 수 있음");
	}
}
class Bird extends Animal{
	void walk() {
		System.out.println("걸을 수 있음");
	}
	void fly() {
		System.out.println("날을 수 있음");
	}
	void sing() {
		System.out.println("노래를 부를 수 있음");
	}
}
public class BirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bird b=new Bird();
        b.walk();
        b.fly();
        b.sing();
	}

}
