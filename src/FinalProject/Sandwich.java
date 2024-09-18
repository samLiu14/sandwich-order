package FinalProject;

import java.util.Scanner;

public class Sandwich {
	
	protected String[][] itemList = { {"Bread", "White Bread", "Wheat Bread", "French Bread", "Whole Grain Bread"},
									  {"Toppings", "Red onions", "Olives", "Pickles", "Lettuce", "Green peppers", "Tomatoes", "Cheese"}, /*veg length = 7*/
									  {"Meat", "Ham", "Roasted Chicken Breast", "Turkey Breast", "Roast Beef", "Pastrami", "Pepporoni", "Bologna", "Salami", "Egg"} };

	protected double[][] priceList = { {0, 1.5, 1.6, 1.8, 2.0},
									   {0, 0.05, 0.10, 0.10, 0.20, 0.25, 0.30, 0.50},
									   {0, 1.0, 1.1, 1.2, 1.3, 1.35, 1.5, 1.65, 1.75, 2.0} };
	
	protected int[][] orderList = new int[3][];
	
	

}
