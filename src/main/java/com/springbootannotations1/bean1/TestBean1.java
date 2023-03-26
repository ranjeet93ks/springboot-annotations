package com.springbootannotations1.bean1;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class TestBean1 {
	
	TestBean1(){
		System.out.println("TestBean1 from diff branch created :: ");
	}

}
