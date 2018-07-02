package org.farazrehman.java2c;

public class Java2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- HELLO 2C ----");
		System.out.println(getName());
		
		Coin nc = new Coin();
		System.out.println(nc.getCName());
		
		System.out.println("Now I am on MAC");

	}
	
	static String getName () {
		String name = "Static Mutable String";
		return name;
	}
	

}
