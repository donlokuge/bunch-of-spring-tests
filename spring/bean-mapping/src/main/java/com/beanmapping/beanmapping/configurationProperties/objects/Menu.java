package com.beanmapping.beanmapping.configurationProperties.objects;

public class Menu {

	private String name;
    private String path;
    private String title;

    //getters and setters
    public Menu() {
		// TODO Auto-generated constructor stub
	}
    	

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
