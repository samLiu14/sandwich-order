package FinalProject;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order extends Sandwich {
	
	protected String customer;
	
	public Order() {
	}
	
	public void test() {
		System.out.println(itemList[1].length);
	}
	
	public void askOrder(int index) {
		Scanner input = new Scanner(System.in);

		int choice = 0, counter = 0;
		int listLength = itemList[index].length;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		do{
			System.out.println("=== Select a " + itemList[index][0] + " ===");
			for(int i = 1; i < listLength; i++) {
				System.out.println(i + " | " + itemList[index][i] + " | " + priceList[index][i]);
			}
			
			if(index == 1) {
				System.out.println("8 | Quit vegetable selection");
			}
			
			choice = input.nextInt();
			
			if(choice < 1 || choice > listLength-1) {
				if(index != 1 || choice > listLength) {
					System.out.println("Error! Please input valid order #");
				}
			}
			else {
				temp.add(choice);
			}
			
			if((index == 1 && choice == listLength)) {
				break;
			}
			
		} while((index == 1 && choice != listLength) || (choice < 1 || choice > listLength));
		
		orderList[index] = new int[temp.size()];
		
		for(int i = 0; i < temp.size(); i++) {
			orderList[index][i] = temp.get(i);
		}
		
	}
	
	public void nameEntry() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter customer's name: ");
		customer = input.nextLine();
	}
	
	public String printOrder() {
		Date now = new Date(); 
		DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM); 
		String time = defaultDate.format(now);
		
		double total = 0;
		String text = time + " | " + customer + "'s Order: \n", temp;
		
//		System.out.println(text);
		
		for(int x = 0; x < orderList.length; x++) {
			for(int y = 0; y < orderList[x].length; y++) {
				int index = orderList[x][y];
				temp = itemList[x][index] + ", ";
//				System.out.print(temp);
				total+=priceList[x][index];
				text+= temp;
				
			}
		}
		
//		System.out.print("$" + total);
		
		text+= " | $" + total;
		
		return text;
	}
	
	public void andwichIO() {
		
	}
}
