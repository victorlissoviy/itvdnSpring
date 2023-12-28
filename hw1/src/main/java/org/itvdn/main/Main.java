package org.itvdn.main;

import org.itvdn.implementation.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Knight knight = context.getBean(Knight.class);

		knight.doneQuest();
	}
}
