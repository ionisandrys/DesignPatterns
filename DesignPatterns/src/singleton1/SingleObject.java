package singleton1;

 class SingleObject {

	/*  > create an object of type SingleObject
	 >  Static member: it gets memory only once because of static,
	> and contains the instance of the SingleObject class.       */
	
	private static SingleObject obj = new SingleObject();
	
	// create a private constructor, so this class cannot be instantiated !!!
	// Private constructor will prevent to instantiate the SingleObject class from outside the class.
	private SingleObject(){}
	
	// get the object available
	//     Static factory method: This provides the global point of access
	// to the SingleObject class object and returns the instance to the caller.
	public static SingleObject getObj(){
		return obj;
	}
		
		public void showMessage(){
			System.out.println("This is how singleton pattern works");
		}
	
}

 	