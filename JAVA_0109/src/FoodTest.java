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
		System.out.println("끓는 물에 라면&스프 2분간");}
    void taste() {
    	System.out.println("개운하고 구수한 맛");
	}
    
}
public class FoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
