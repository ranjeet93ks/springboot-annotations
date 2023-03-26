package com.springbootannotations.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "mail")
@Data
@Component
public class MailProps {

	private String from;
	private String to;
	private String port;

}