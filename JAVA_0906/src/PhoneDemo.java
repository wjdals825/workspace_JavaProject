 class Phone {
	 String model;
	 int value;
	 
	 void print() {
		 System.out.println(value+"�� ��¥��"+model +"����Ʈ��");
	 }
 }
 
public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model="������ S9";
		myPhone.value=100;
		myPhone.print();
		
		Phone yourphone = new Phone();
		myPhone.model="G6";
		myPhone.value=85;
		myPhone.print();
		
	

	}

}
