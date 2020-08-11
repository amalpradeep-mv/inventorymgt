package org.dxctraining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryMain {

	public static void main (String args[]) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
	}
}
