package com.springbootannotations.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeBean {

	public EmployeeBean() {
		System.out.println("EmployeeBean bean creation using  @Component");
	}

}