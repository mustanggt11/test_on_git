/**
 * 
 */
package hasaan;

/**
 * @author Hasaan Keen
 *
 */

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(scan.nextLine());
		
		
		//while clause 
				int counter = 0;
				
				while (counter < 10) {
					System.out.println(counter);
					counter++;
				}
				
		//tuna class
		tuna tunaObj = new tuna();
		tunaObj.outputMessage();
		
	}
	
	
}
