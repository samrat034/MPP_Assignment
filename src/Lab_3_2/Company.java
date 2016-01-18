package Lab_3_2;

import java.util.ArrayList;

public class Company {
	private String name;
	
	ArrayList<Department> department;
	
	public Company(String name) {
		
		this.name = name;
		department= new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addDept(Department d)
	{	
		
		department.add(d);
	}

	public void print(){
		System.out.println("Company Name:" +getName());
		
		for(Department d:department){
			d.print();
		}
		System.out.println("!!!!!!END!!!!!!!! ");
		
		
	}
	
	public double getSalary(){
		double sum=0;
		for(Department d:department){
			sum+=d.getSalary();
		}
		System.out.println("Total Salary of Company " +getName()+"is" +sum);
		
		return sum;
		
		
	}

}
