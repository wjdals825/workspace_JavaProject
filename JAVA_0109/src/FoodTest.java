abstract class Food{
	private String foodName;
	public String getFoodName() {return foodName;}
	public void setFoodName(String foodName) {
		this.foodName=foodName; }
	Food(String foodname){ this.foodName=foodName;}
	abstract void cook();
	abstract void taste();
}
class Noodle extends Food{
	Noodle (String foodName){
		super(foodName);
	}
	void cook() {
		System.out.println("���� ���� ���&���� 2�а�");}
    void taste() {
    	System.out.println("�����ϰ� ������ ��");
	}
    
}
public class FoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
