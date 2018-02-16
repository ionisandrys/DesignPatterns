package singleton1;

// get the only object from SingleObject class

public class SingletonDemo {

	public static void main(String[] args) {
		
		// get the only onject
		SingleObject instance = SingleObject.getObj();
		
		instance.showMessage();
		
		
		   //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();
	}

}
