package creational_Factory2;

public class Rectangle implements Shape {

	@Override
	public void draw() {
	
		int l=10;
		int h = 5;
		System.out.println("Drawing rectangle with area: "+ l*h);

	}

}
