package FinalProject;

public class SandwichApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"bob", "bobby", "bobbert"};
		
		Order test = new Order();
				
//		test.test();
		
		test.askOrder(0);
		test.askOrder(1);
		test.askOrder(2);
		
//		test.listOrder();
		
		test.nameEntry();
		
		System.out.println(test.printOrder());

		
		
		

	}

}
