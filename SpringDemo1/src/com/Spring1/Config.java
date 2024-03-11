package com.Spring1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  //Bean.xml
@ComponentScan(basePackages = "com")
@PropertySource(value = "classpath:app1.properties")
public class Config {

}
