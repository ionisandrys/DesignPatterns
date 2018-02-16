package creational_Factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		System.out.println("Enter the name of the shape: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String shapeName = br.readLine();
		
		Shape s = shapeFactory.getShape(shapeName);
		
		System.out.println("Shape is: " + shapeName + " area value is: "); 
		s.draw();
		
		/*
		// get an object of Circle and call draw() method
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
*/
	}

}
