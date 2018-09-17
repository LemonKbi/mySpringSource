package com.lemon.demo;

import com.lemon.pojo.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		UserInfo userInfo=(UserInfo)context.getBean("user");
		System.out.println(userInfo.getName());
	}
}
