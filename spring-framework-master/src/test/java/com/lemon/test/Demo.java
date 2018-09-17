package com.lemon.test;

import com.lemon.test.pojo.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		UserInfo userInfo=(UserInfo) context.getBean("user");
		System.out.println(userInfo.getName());
	}
}
