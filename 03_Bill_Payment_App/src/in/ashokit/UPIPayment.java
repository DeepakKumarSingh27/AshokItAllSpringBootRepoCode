package in.ashokit;

public class UPIPayment implements IPayment {

	@Override
	public String pay(double amount) {

		return "payment successful throuth UPI";
	}

}
