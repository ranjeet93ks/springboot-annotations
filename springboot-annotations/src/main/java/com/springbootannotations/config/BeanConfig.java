package com.springbootannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootannotations.entity.TestBean;

@Configuration
public class BeanConfig {

	@Bean
	public TestBean testBean() {
		return new TestBean();
	}

}
