package comparecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmpId("ABC123");
		e1.setName("Hareesha");
		
		Employee e2 = new Employee();
		e2.setEmpId("ABC345");
		e2.setName("Aryan");
		
		Employee e3 = new Employee();
		e3.setEmpId("ABC678");
		e3.setName("Nickle");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list);//used to sort collection 
		System.out.println(list);
		
	}

}
