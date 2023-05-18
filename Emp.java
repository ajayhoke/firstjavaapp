package assignment1;

public class Emp 
{
	private int id;
	private String name;
	private float salary;
	private float calSalary;
	
	public calSalary()
	{
		
	}
	public Emp()
	{
		
	}
	public Emp(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("ID - "+id);
		System.out.println("name  "+name);
		System.out.println("Salary  "+salary);
	}
}
