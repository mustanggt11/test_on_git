import java.util.Scanner;
public class Temperature{
	public final double TEMP = 100.0;
	public static void main(String args[]){
           System.out.println("Please Enter the current temperature");
	   Scanner scan = new Scanner(System.in);
	   double temp = scan.nextDouble();
	   if(temp<TEMP){
		   System.out.println("Low temperature");
	   }
	   else {
		   System.out.println("High temperature");
	   }
		
	System.out.println("Adding new changes to source");
        }
}
