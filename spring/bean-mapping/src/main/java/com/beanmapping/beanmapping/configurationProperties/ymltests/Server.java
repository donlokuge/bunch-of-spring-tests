package com.beanmapping.beanmapping.configurationProperties.ymltests;

public class Server {
	
	private String email;
	private String port;
	private String ip;
	
	
	@Override
	public String toString() {
		return "Server [email=" + email + ", port=" + port + ", ip=" + ip + "]";
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

 
	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}
	
	 
	
	

}
