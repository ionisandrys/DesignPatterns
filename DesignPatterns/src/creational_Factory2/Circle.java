package creational_Factory2;

public class Circle implements Shape {

	@Override
	public void draw() {
		int r = 10;
		System.out.println("Drawing circle with area: "+ ((Math.PI)*Math.pow(r, 2))/2);
		
	}

}
