package in.ashokit;

public class DebitcardPayment implements IPayment {

	@Override
	public String pay(double amount) {

		return "Payment successful through debitcard";
	}

}
