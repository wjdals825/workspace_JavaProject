class Animal{
	void walk() {
		System.out.println("���� �� ����");
	}
}
class Bird extends Animal{
	void walk() {
		System.out.println("���� �� ����");
	}
	void fly() {
		System.out.println("���� �� ����");
	}
	void sing() {
		System.out.println("�뷡�� �θ� �� ����");
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
