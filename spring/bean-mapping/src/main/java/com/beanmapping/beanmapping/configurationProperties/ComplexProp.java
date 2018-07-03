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

	
	// does not auto inject here. will use setter method
	 private List<Menu> menus;
	 
	 public ComplexProp() {
		 System.out.println("spring wiil call setter method of ComplexProp class for injectiing via @ConfigurationProperties");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ComplexProp [menus=" + menus + "]";
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		System.out.println("ComplexProp setMenus is called");
		this.menus = menus;
	}
	
	 
}
