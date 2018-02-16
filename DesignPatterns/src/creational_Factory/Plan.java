package creational_Factory;

import java.io.*;
// defining abstract class for creating an object
abstract class Plan {

	 protected double rate;
	 
	abstract void getRate();
	
	public void calculateBill(int units){
		System.out.println(units*rate);
	}
}
