package Lab_3_2;

import java.util.Date;


public class Employee {
	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String birthDate;
	private String SSN;
	private double Salary;
	
	
	public Employee(int employeeId, String firstName, String middleName,
			String lastName, String birthDate, String sSN, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		Salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void print()
	{
		System.out.println("\t\t******Employee Details********");
		System.out.println("\t\tID: "+employeeId + "\n\t\tName: "+firstName+" "+middleName+" "+lastName);
		System.out.println("\t\tDOB: "+ birthDate);
		System.out.printf("\t\tSSN %s",SSN);
		System.out.println("\t\tSalary: "+Salary);
	}
	
	
	

}
