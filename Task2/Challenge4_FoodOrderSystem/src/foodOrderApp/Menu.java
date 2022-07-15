package foodOrderApp;

public class Menu {
	String foodName;
	Double foodPrice;

	public Menu(String foodName, Double foodPrice) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}
}
