package com.demo;

/**
 * Description declare or access private method of Interface
 * @author Gaurav
 * @version JDK1.9
 */
interface Shape {

	default void draw() {

		drawCircle();
		drawSquare();
	}

	/**
	 * Description declare private non-static method 
	 * @return void to be
	 * tested @throws
	 */
	private void drawCircle() {

		System.out.println("Circle is draw..");
	}

	/**
	 * Description declare private static method 
	 * @return void to be tested 
	 * @throws
	 */
	private static void drawSquare() {

		System.out.println("Square is draw..");
	}
}

public class PrivateInterface implements Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new PrivateInterface();
		shape.draw();
	}

}
