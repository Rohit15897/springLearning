import java.io.File;
import java.io.IOException;

import groovy.lang.GroovyClassLoader;

public class TestProject {
	
	private String name;
	private int age;
	private String department;
	private Class<?> groovy;
	
	
	
	
	public TestProject() {}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public Class<?> getGroovy() {
		return groovy;
	}




	public void setGroovy(Class<?> groovy) {
		this.groovy = groovy;
	}
	
	
	
	
	
	

}
