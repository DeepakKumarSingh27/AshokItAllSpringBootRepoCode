package in.ashokit;

public class BillCollector {
	private IPayment payment;

	
	
	  public void setPayment(IPayment Payment) {
	  System.out.println("Setter method is executed"); this.payment = Payment; }
	  
	  public BillCollector() {
	   System.out.println("CONST");
	  }
	 
	 
	public BillCollector(IPayment payment) {
		this.payment = payment;
		System.out.println("Bill Constructor parametrized Constructor");
	}

	public void collectPayment(double amount) {
		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
