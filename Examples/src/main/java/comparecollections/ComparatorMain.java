package comparecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Order o1 = new Order();
		Order o2 = new Order();
		Order o3 = new Order();
		o1.setLocation("US");;
		o1.setOrderId("OR123");
		o2.setLocation("INDIA");;
		o2.setOrderId("OR234");
		o3.setLocation("china");;
		o3.setOrderId("OR101");
		
		List<Order> orList = new ArrayList<Order>();
	}

}
