package com.lemon.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

import java.io.Serializable;

public class UserInfo implements Serializable , BeanFactoryAware , BeanNameAware {

	private static final long serialVersionUID = 3026436128384352508L;

	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", age=" + age +
				'}';
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("============= BeanFactoryAware ==========");
	}

	public void setBeanName(String name) {
		System.out.println("============== BeanNameAware =========");

	}
}
