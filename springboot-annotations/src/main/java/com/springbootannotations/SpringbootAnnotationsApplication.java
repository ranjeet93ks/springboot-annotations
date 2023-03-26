package com.springbootannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  //=@EnableAutoConfiguration + @ComponentScan + @Configuration
//@ComponentScan("com.springbootannotations1") // to search for bean inside com.springbootannotations1 package and it child package
public class SpringbootAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAnnotationsApplication.class, args);
	}

}
