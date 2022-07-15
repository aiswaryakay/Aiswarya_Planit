package foodOrderApp;

import java.util.ArrayList;
import java.util.Scanner;

/***
 * 
 * @author Aiswarya
 *
 */
public class FoodOrderingSystem {

	public ArrayList<Restaurant> restaurantList = new ArrayList<>();

	FoodOrderingSystem() {
		this.restaurantList.add(new Restaurant("Awesome Pizza Place", new Menu("Pepperoni Pizza", 20.00)));
		this.restaurantList.add(new Restaurant("Wild Burger Joint", new Menu("Burger", 15.00)));
		this.restaurantList.add(new Restaurant("Amazing Fried Chicken", new Menu("Chicken", 10.00)));

	}

	// This method will accept foodname as parameter. It will search the foodname against available menu and if found will call the corresponding restaurant to place order and print receipt.
	public void placeOrder(String foodName) {
		boolean orderSuccess = false;
		for (Restaurant restaurant : this.restaurantList) {
			for (Menu menu : restaurant.getMenu()) {
				if (menu.getFoodName().toLowerCase().contains(foodName.toLowerCase())) {
					restaurant.printReceipt(menu.getFoodName(), menu.getFoodPrice());
					orderSuccess = true;
					break;
				}
			}
		}

		if (orderSuccess) {
			System.out.println("-- Thank you for your order -- \n");
		} else {
			System.out.println("Sorry. Item not available now \n");
		}
	}

	public static void main(String[] args) {
		FoodOrderingSystem foodApp = new FoodOrderingSystem();
		System.out.println("Enter food name to order. Type 'finish' to complete your order \n");
		Scanner sc = new Scanner(System.in);
		String foodName = sc.next();
		while (!"finish".equalsIgnoreCase(foodName)) {
			foodApp.placeOrder(foodName);
			foodName = sc.next();
		}
	}
}
