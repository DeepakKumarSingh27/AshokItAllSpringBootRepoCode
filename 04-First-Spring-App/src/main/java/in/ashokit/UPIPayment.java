package in.ashokit;

public class UPIPayment implements IPayment {

	
	public UPIPayment() {
		System.out.println("UPIPayment Constructor");
	}

	@Override
	public String pay(double amount) {
    System.out.println(amount);
		return "payment successful throuth UPI";
	}

}
