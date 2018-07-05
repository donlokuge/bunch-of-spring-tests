package com.beanmapping.beanmapping.configurationProperties.ymltests;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component // marks the class as a source of bean definitions
@EnableConfigurationProperties // this annotation is used to enable @ConfigurationProperties annotated beans in
								// the Spring application
@PropertySource("classpath:complex/b.yaml") // binds and validates the external configurations to a configuration class
@ConfigurationProperties
public class YMLTest1 {

	private Server server;
	private List<String> endPoints;

	public YMLTest1() {
		System.out.println(
				"" + "\nYMLTest1:: Spring Boot, it picks .properties or .yaml files in the following sequences :\n"
						+ "application-{profile}.{properties|yml}\n" + "application.{properties|yml}" + "\n");

	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	public List<String> getEndPoints() {
		return endPoints;
	}

	public void setEndPoints(List<String> endPoints) {
		this.endPoints = endPoints;
	}

	@Override
	public String toString() {
		return "YMLTest1 [server=" + server + ", endPoints=" + endPoints + "]";
	}

}
