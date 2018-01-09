package com.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> list1 = Stream.of(2, 2, 3, 4, 5, 6).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());

		List<Integer> list2 = Stream.of(1, 2, 3, 4, 5, 6).dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());

		System.out.println("Numbers are: ");
		for (Integer number : list1) {

			/*
			 * empty list because it fails at first list element, and takeWhile stops here.
			 */
			System.out.print(number + ", ");

		}

		System.out.println("\n\nNumbers are: ");
		for (Integer number : list2) {

			/*
			 * Stream dropWhile method returns result on the basis of order of stream
			 * elements
			 */
			System.out.print(number + ", ");

		}

		System.out.println("\n\nNumbers are: ");

		/* Iterate stream elements till the specified condition */
		Stream.iterate(1, i -> i <= 10, i -> i * 3).forEach(System.out::println);
	}

}
