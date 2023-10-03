package com.junit_project;

import java.util.concurrent.TimeUnit;

public class Calculator {
	int a=10;
	int b=20;
	String name="ajayruban";
	String temp="";
public int addition() {
	 return a+b;
}
public int division() {
	return a/b;
}
public String nameReverse() {
	for(int i=name.length()-1;i>=0;i--) {
		char k=name.charAt(i);
		temp=temp+k;
	}
	return temp; 
}
public String setName1(String name) {
	return name;
}
public String setName(String name) {
	return name;
	
}
public String getTimeOut() throws InterruptedException{
	TimeUnit.SECONDS.sleep(1000);
	return "Apple";
}
}
