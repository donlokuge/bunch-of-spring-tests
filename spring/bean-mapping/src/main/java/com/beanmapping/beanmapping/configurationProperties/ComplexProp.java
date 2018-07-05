package com.beanmapping.beanmapping.configurationProperties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.beanmapping.beanmapping.configurationProperties.objects.Menu;
 
@Component
@PropertySource("classpath:complex/c.properties")
@ConfigurationProperties("app")
public class ComplexProp {
	
	private String name;
	private String email;
	private int number;

	
	// does not auto inject here. will use setter method
	 private List<Menu> menus;
	 
	 public ComplexProp() {
		 System.out.println("spring wiil call setter method of ComplexProp class for injectiing via @ConfigurationProperties");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "ComplexProp [name=" + name + ", email=" + email + ", number=" + number + ", menus=" + menus + "]";
	}



	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		System.out.println("ComplexProp setMenus is called");
		this.menus = menus;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	 
}
