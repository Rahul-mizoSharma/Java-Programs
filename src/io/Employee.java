package io;

public class Employee {
	
	String name;
	String deg;
	
	
	public Employee(String name,String desg) {
		super();
		this.name=name;
		this.deg=desg;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return deg;
	}

	public void setDesg(String desg) {
		this.deg = desg;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", deg=" + deg + "]";
	}	
}
