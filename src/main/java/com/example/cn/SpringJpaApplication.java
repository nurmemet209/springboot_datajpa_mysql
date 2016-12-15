package com.example.cn;

import com.example.cn.entity.Test2Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;


/**
 @SpringBootApplication is a convenience annotation that adds all of the following:

 @Configuration tags the class as a source of bean definitions for the application context.
 @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
 @ComponentScan tells Spring to look for other components, configurations, and services in the the hello package, allowing it to find the controllers.
 */
@SpringBootApplication
public class SpringJpaApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);



	}




	/**
	 * bean的另一种注入方式，Test2Entity中不配置任何注入相关的注解，配置到方法上面
	 * @return
	 */
	@Bean
	@ConfigurationProperties(prefix = "rk" ,locations = "classpath:custom.properties")
	public Test2Entity getCustomTest2Entity(){
		return new Test2Entity();
	}
}
