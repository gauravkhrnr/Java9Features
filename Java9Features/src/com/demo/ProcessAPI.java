package com.demo;

/**
 * Description ProcessAPI class helps to manage and control operating system
 * processes
 * 
 * @author Gaurav
 * @version JDK1.9
 */

public class ProcessAPI {

	public static void main(String[] args) {

		ProcessHandle currentProcess = ProcessHandle.current(); // Current Process handle
		System.out.println("Process Id: " + currentProcess.pid()); // Process id
		System.out.println("Direct children: " + currentProcess.children()); // Direct children of the process
		System.out.println("Class name: " + currentProcess.getClass()); // Class name
		System.out.println("All processes: " + ProcessHandle.allProcesses()); // All current processes
		System.out.println("Process info: " + currentProcess.info()); // Process info
		System.out.println("Is process alive: " + currentProcess.isAlive());
		System.out.println("Process's parent " + currentProcess.parent()); // Parent of the process
	}

}
