package creational_Factory2;

public class ShapeFactory {

	// using getShape() method to get object of type Shape
	
	public Shape getShape(String shapeType){
		
		if(shapeType == null){
			return null;
		}
		

		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		
		return null;
	}
		
}
