package StreamsAPI_FunctionsPractice;

public class Orders {
	String orderId;
    String status;

    Orders(String orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
