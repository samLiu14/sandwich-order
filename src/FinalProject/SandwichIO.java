package FinalProject;

import java.io.IOException;
import java.io.PrintWriter;

public class SandwichIO {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		PrintWriter outputFile = new PrintWriter("orderline.txt");
		Order test = new Order();
		
		for(int i = 0; i < 3; i++) {
			test.askOrder(i);
		}
		
		outputFile.println(test.printOrder());
		
		outputFile.close();

	}

}
