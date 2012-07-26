package org.madbit.spring.periodic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("periodicTasks.xml");
	}
}
