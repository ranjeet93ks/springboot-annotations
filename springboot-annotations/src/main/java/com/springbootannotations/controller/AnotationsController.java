package com.springbootannotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootannotations.config.MailProps;
import com.springbootannotations.entity.*;
import com.springbootannotations.service.AnnotationService;
//import com.springbootannotations1.bean1.TestBean1;

@RestController
@PropertySource("classpath:custom.properties") // to read customized properties file
public class AnotationsController {

	@Autowired
	EmployeeBean EmployeeBean;//// creating bean using @Component

	@Autowired
	TestBean testBean; // creating bean using @Bean/@Configuration

	// @Autowired
	// TestBean1 testBean1;
	// TestBean1' that could not be found --error cuz TestBean1 is defined in
	// seperate directory where @springBootApplication defined
	// to avoid need to add @componentscan in springbootapplicatiobn calss to allow
	// search of this sepearte directory as well

	@Autowired
	EagerLoadingBean eagerLoadingBean; // bean will be created even if we won't autowire

	@Autowired
	LazyLoadingBean lazyLoadingBean; // bean wont be created until we autowire

	@Autowired
	// @Qualifier("AnnotationServiceImplV1") // if we want to use
	// AnnotationServiceImpl
	private AnnotationService annotationService; // AnnotationServiceImplV1/2 implements this and hence error cuz of 2
													// beans

	public AnotationsController() {
		System.out.println("controller object created ....");
	}

	@Value("${mail.from}")
	private String from;
	@Value("${mail.to}")
	private String to;
	@Value("${mail.port}")
	private String port;
	@Value("${message}")
	private String message; // from custom.properties
	
	@Autowired
    private MailProps mailProps;


	// localhost:8080/test
	@GetMapping("/test")
	public String method() {
		testBean.method();
		annotationService.method();
		System.out
				.println("from :" + from + ", " + "to :" + to + ", " + "port : " + port + "," + "message : " + message);
		System.out.println("mail properties : "+ mailProps);
		return "pass";
	}

}
