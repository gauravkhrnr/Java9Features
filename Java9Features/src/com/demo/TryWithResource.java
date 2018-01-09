package com.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description TryWithResource class has resources declared outside the try-catch Block
 * 
 * @author Gaurav
 * @version JDK1.9
 */
public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException {

		/* declare resource outside try-catch block */
		FileOutputStream fos = new FileOutputStream("writefile.txt");

		try (fos) {

			String message = "I am Gaurav";
			fos.write(message.getBytes());
			System.out.println("File written");

		} catch (IOException ex) {

			ex.printStackTrace();
		}
	}
}
