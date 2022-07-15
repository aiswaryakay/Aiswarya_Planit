package foodOrderApp;

import java.util.ArrayList;

public class Restaurant {
	String restaurantName;
	ArrayList<Menu> menu;

	public Restaurant(String restaurantName, Menu menuItem) {
		this.restaurantName = restaurantName;
		this.menu = new ArrayList<Menu>();
		menu.add(menuItem);
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public ArrayList<Menu> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}

	public void printReceipt(String foodName, Double foodPrice) {
		System.out.println("Receipt \n-------\n" + this.getRestaurantName() + "," + foodName + "," + foodPrice);
	}

}
