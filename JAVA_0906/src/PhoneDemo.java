 class Phone {
	 String model;
	 int value;
	 
	 void print() {
		 System.out.println(value+"만 원짜리"+model +"스마트폰");
	 }
 }
 
public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model="갤럭시 S9";
		myPhone.value=100;
		myPhone.print();
		
		Phone yourphone = new Phone();
		myPhone.model="G6";
		myPhone.value=85;
		myPhone.print();
		
	

	}

}
