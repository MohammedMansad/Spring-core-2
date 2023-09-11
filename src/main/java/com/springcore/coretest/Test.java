package com.springcore.coretest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.perfom.AppConfig;
import com.springcore.perfom.SpringCorePerform;
import com.springcore.perfom.StudentService;

public class Test {
public	static ApplicationContext context;
public	static ApplicationContext context1;

public static ApplicationContext getApplicationContext() {
	 if(context==null) {
		 context=new ClassPathXmlApplicationContext("beans.xml");
		 context1 = new AnnotationConfigApplicationContext(AppConfig.class);
		 
	 }
	 return context;
}
public static void main(String[] args) {
	getApplicationContext();
	SpringCorePerform bean = context.getBean("springCorePerform",SpringCorePerform.class);
	StudentService bean1 = context1.getBean(StudentService.class);
	bean.show();
	bean1.show();
	Test t=new Test();
	
//System.out.println(	prototype);
}
}
