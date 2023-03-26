package com.springbootannotations.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AnnotationServiceImplV2 implements AnnotationService {

	@Override
	public void method() {
		System.out.println("AnnotationServiceImplV2 : method() :");

	}

}