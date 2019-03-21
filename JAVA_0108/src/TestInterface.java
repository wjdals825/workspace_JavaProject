interface PhoneInterface{
	int BUTTONS =20;
	
	void sendCall();
	void receiveCall();
}

interface MobliePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x*y;
	}
}

class SmartPhone extends PDA implements MobliePhoneInterface{
	public void sendCall() {
		System.out.println("��ȭ �ɱ�");
	}
	public void receiveCall() {
		System.out.println("��ȭ �ޱ�");
	}
	public void sendSMS() {
		System.out.println("SMS ������");
	}
	public void receiveSMS() {
		System.out.println("SMS �ޱ�");
	}

	public void play() {
		System.out.println("���� ���");
	}
	public void stop() {
		System.out.println("��� ����");
	}
	
	public void schedule() {
		System.out.println("���� ����");
	}
}

public class TestInterface{

	public static void main(String[] args) {

		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.schedule();
		
	}

}