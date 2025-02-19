package in.ashokit;

import java.io.FileReader;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) throws Exception {
		Order order = new Order();
		order.setOrderId(101);
		order.setOrderBy("Ramu");
		order.setOrderStatus("CONFORMED");
		order.setBillAmt(11111.999d);

		Gson gson = new Gson();
		String json = gson.toJson(order);
		System.out.println(json);

		gson.fromJson(new FileReader("order.json"), Order.class);
        
	}
}
