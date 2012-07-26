package org.madbit.spring.periodic;

public class PeriodicTask {
	
	public synchronized void execute() {
		System.out.println("Hello world");
	}
}
