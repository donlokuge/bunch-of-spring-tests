package com.beanmapping.beanmapping.beans1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@PropertySource("classpath:a.properties")
public class BeanConfiguration { 
	
	@Value("${app.datasource.driverClassName}") String driverClassName;
    @Value("${app.datasource.url}") String url;
    @Value("${app.datasource.username}") String username;
    @Value("${app.datasource.password}") String password;

	@Bean
	public Bean1 bean1() {
		return new Bean1();
	}
	
	@Bean
	public A a() {
		
		// look inside a to see how properties value are injected
		return new A();
	}
	
	// since there is no mysql in localhost commting below
//	@Bean(name = "dataSource")
//    public DataSource getDataSource() {
//		System.out.println(driverClassName);
//        DataSource dataSource = DataSourceBuilder
//                .create()
//                .username(username)
//                .password(password)
//                .url(url)
//                .driverClassName(driverClassName)
//                .build();
//        return dataSource;
//    }

	
}
