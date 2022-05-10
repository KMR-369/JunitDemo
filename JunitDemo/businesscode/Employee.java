package businesscode;

import java.util.Objects;

public class Employee 
{
	private int empid;
	private String name;
	private int salary;
	
	public Employee(int empid, String name, int salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	public static String getEmpNameWithHighestSalary()
	{
        /**   * logic to get Highest paid employee        */
        return "Mani";
    }
    
    public static Employee getHighestPaidEmployee()
    {
        /**  * hiding logic to get highest paid employee     */
        return new Employee(101, "Mani", 15000);
    }
	
}
