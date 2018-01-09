package com.demo;

/**
 * Description AnonymousClass class allows diamond operator for anonymous inner class
 * 
 * @author Gaurav
 * @version JDK1.9
 */

abstract class Hello<T> {

	abstract T show(T a, T b);

}

public class AnonymouClass {

	public static void main(String[] args) {

		Hello<String> hello = new Hello<String>() { /* diamond operator is not allowed for anonymous class in java 8 */

			@Override
			String show(String a, String b) {

				return a + b;
			}
		};

		String result = hello.show("Hello! Java ", "9");
		System.out.println(result);

	}

}
