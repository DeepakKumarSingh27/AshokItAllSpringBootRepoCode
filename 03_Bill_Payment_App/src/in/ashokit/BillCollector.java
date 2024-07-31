package in.ashokit;

public class BillCollector {
	private IPayment iPayment;

	public void setiPayment(IPayment iPayment) {
		this.iPayment = iPayment;
	}

	public BillCollector() {
	}

	public BillCollector(IPayment payment) {
		this.iPayment = payment;
	}

	public void collectPayment(double amount) {
		String status = iPayment.pay(amount);
		System.out.println(status);
	}

}
