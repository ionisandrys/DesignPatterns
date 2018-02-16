package prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter employee id: ");
		int id= Integer.parseInt(br.readLine());
		System.out.print("\n");
		
		System.out.print("Enter Employee Name: ");  
        String name=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Designation: ");  
        String designation=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Address: ");  
        String address=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Salary: ");  
        double salary= Double.parseDouble(br.readLine());  
        System.out.print("\n");  

        Employee e1 = new Employee(id,name,designation,salary,address);
        
        e1.showRecord();
        
        System.out.println();
        
        Employee e2 = (Employee)e1.getClone();
        
        e2.showRecord();
        
        
        
        
	}

}
