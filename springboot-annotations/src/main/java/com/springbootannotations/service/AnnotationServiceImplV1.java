package com.springbootannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class AnnotationServiceImplV1 implements AnnotationService {

	@Override
	public void method() {
		System.out.println("AnnotationServiceImplV1 : method() :");
		
	}

}
