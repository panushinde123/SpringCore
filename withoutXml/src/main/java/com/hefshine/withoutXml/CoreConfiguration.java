package com.hefshine.withoutXml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:info.properties")
@Configuration
@ComponentScan(basePackages ="com.hefshine.*")
public class CoreConfiguration {
	
	

}
