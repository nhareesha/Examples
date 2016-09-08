package comparecollections;

/**
 * compareTo method of Comparable interface is used to compare two 
 * user defined object 
 * 
 * @author Hareesha
 *
 */
public class Employee implements Comparable {
	private String name;
	private String empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		int result = (this.name).compareTo(emp.getName());
		if(result>0)
			return 1;
		else if(result<0)
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
}
