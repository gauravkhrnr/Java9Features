package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Description SafeVarargsAnnotation class helps to perform safe operations on method of its
 * varargs parameters .
 * 
 * @author Gaurav
 * @version JDK 1.9
 */
public class SafeVarargsAnnotation {

	@SafeVarargs /* remove the typesafe warning while compile */
	private void display(List<String>... products) {

		for (List<String> product : products) {

			System.out.println(product);
		}
	}

	public static void main(String[] args) {

		SafeVarargsAnnotation safeVarargs = new SafeVarargsAnnotation();

		List<String> products = new ArrayList<>();
		products.add("Iphone");
		products.add("Sony");
		products.add("Samsung");

		safeVarargs.display(products);
	}

}
