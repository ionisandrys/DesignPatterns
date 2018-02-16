package creational_Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. 
// Subclasses are responsible to create the instance of the class.

/* Working:
	GenerateBill class asks GetPlanFactory class for a Plan object. 
	GetPlanFactory creates 3 object of type Plan
	Objects classes extends one Plan abstract class


*/
public class GenerateBill {

	
	public static void main(String[] args) throws IOException {
		
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which bill will be generated");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter number of units: ");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.print("Bill amount for "+planName+" of "+units+" units is: ");
		p.getRate();
		p.calculateBill(units);
		
		

	}

}
