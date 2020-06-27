package com.fulcrum.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fulcrum.model.Account;
import com.fulcrum.service.impl.AccountServiceImpl;

public class FulcrumClient {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		
		AccountServiceImpl  serviceImpl  = applicationContext.getBean("accountServiceImpl",AccountServiceImpl.class);
		serviceImpl.updateAccountBalance(new Account("52548455", "Jagdish Khetre"), 2514L);
		
		((AbstractApplicationContext) applicationContext).close();
	}

}
