package hasaan;

import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double fnum, snum, answer;
		
		System.out.println("Enter the first number: ");
		fnum = scan.nextDouble();
		
		System.out.println("Enter the sum num: ");
		snum = scan.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
		
		
	
	}
}
