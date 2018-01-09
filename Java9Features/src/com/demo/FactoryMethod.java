package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description FactoryMethod class has Factory methods are special type of static methods that are used
 * to create unmodifiable instances of collections
 * 
 * @author Gaurav
 * @version JDK1.9
 */
public class FactoryMethod {

	public static void main(String[] args) {

		/*
		 * static methods that are used to create unmodifiable instances of collections
		 */
		List<String> products = List.of("Iphone", "Samsung", "Sony", "Micromax", "Oppo");
		// Set<String> products = Set.of("Iphone","Samsung", "Sony", "Micromax",
		//                           "Oppo");
		Map<Integer, String> productList = Map.of(1, "Iphone", 2, "Micromax", 3, "Sony");

		System.out.println("Products:");
		for (String product : products) {

			System.out.print(product + ",");
		}

		System.out.println("\n\nProduct List: ");
		for (Map.Entry<Integer, String> product : productList.entrySet()) {

			System.out.println(product);
		}

		/**************************************
		 * ofEntries()
		 **************************************/

		Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
		Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
		// Creating Map using map entries
		Map<Integer, String> map = Map.ofEntries(e1, e2);
		
		System.out.println("\nEntry List: ");
		// Iterating Map
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
