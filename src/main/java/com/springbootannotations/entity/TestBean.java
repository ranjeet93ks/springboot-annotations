package com.springbootannotations.entity;

public class TestBean {

	public TestBean() {
		System.out.println("TestBean bean creation using @Bean/@Configuration ");
	}

	public void method() {
		System.out.println("method() process executed :: ");
	}

}
