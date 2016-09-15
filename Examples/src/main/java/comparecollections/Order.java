package comparecollections;

public class Order {
	private String orderId;
	private String location;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", location=" + location + "]";
	}
	
}
