package Lab_3_2;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	
	ArrayList<Employee> emp;
	
	public Position(String title, String description){
		this.title=title;
		this.description=description;
		emp= new ArrayList<Employee>();
		
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title=title;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addEmp(Employee e)
	{
		
		emp.add(e);
	}

	public void print() {
		System.out.println("   Position is : " + getTitle());
		System.out.println("   Description of Position : " + getDescription());
		for(Employee e: emp)
		{
			e.print();
		}
	}
	
	public double getSalary(){
		
		double sum=0;
		for(Employee e: emp){
			sum+=e.getSalary();
		}
		System.out.println("Total Salary of Company " +getTitle()+"is" +sum);
		return sum;
	}
}
