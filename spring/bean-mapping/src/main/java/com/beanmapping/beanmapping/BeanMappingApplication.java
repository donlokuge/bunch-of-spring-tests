package com.beanmapping.beanmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.beanmapping.beanmapping.beans1.A;
import com.beanmapping.beanmapping.beans1.B;
import com.beanmapping.beanmapping.beans1.Bean1;
import com.beanmapping.beanmapping.beans2.Bean2;
import com.beanmapping.beanmapping.beans2.Foo;
import com.beanmapping.beanmapping.beans2.SomeClass;
import com.beanmapping.beanmapping.beans3.Bean3;
import com.beanmapping.beanmapping.configurationProperties.ComplexProp;
import com.beanmapping.beanmapping.configurationProperties.GlobalProperties;
import com.beanmapping.beanmapping.configurationProperties.GlobalPropertiesTest2;
import com.beanmapping.beanmapping.configurationProperties.ymltests.YMLTest1;

@SpringBootApplication
public class BeanMappingApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BeanMappingApplication.class, args);
		
		String [] beans = applicationContext.getBeanDefinitionNames();
		System.out.println("========== BEAN NAMES =========");
		for(String name : beans) {
			System.out.println(name);
		}
		
		System.out.println("/n/n");

		// AnnotationConfigApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext();
		// applicationContext.register(BeanConfiguration.class);
		// applicationContext.register(Bean2Config.class);

		// applicationContext.refresh();

		System.out.println("testing bean configuration on app context");

		Bean1 b1 = applicationContext.getBean("bean1", Bean1.class);
		System.out.println(b1);

		Bean2 b2 = applicationContext.getBean("bean2", Bean2.class);
		System.out.println(b2);

		Foo foo = applicationContext.getBean("foo", Foo.class);
		System.out.println("Name : " + foo.getName());

		A a = applicationContext.getBean("a", A.class);
		System.out.println(a);

		B b = applicationContext.getBean("b1", B.class);
		System.out.println(b);

		System.out.println("==== look bean 2 config how some class is injected ====");

		SomeClass someClass = applicationContext.getBean("someclass", SomeClass.class);
		System.out.println(someClass.getNumber());

		System.out.println("====== @ConfigurationProperties Test ========");
		GlobalProperties test1 = applicationContext.getBean("GlobalPropertiesTest1", GlobalProperties.class);
		System.out.println(test1.email);

		GlobalPropertiesTest2 test2 = applicationContext.getBean("globalPropertiesTest2", GlobalPropertiesTest2.class);
		System.out.println(test2.getThreadPool());
		
		System.out.println("======  Test complex egample ========");
		ComplexProp complexProp = applicationContext.getBean("complexProp",ComplexProp.class);
		System.out.println(complexProp);
		
		System.out.println("======  Test yml egample ========");
		YMLTest1 ymlTest1 = applicationContext.getBean("YMLTest1",YMLTest1.class);
		System.out.println(ymlTest1);
		
		
		// applicationContext.close();

		System.out.println("======  Test @component ========");

		Bean3 b3 = applicationContext.getBean("bean3", Bean3.class);
		System.out.println(b3);
	}
}
