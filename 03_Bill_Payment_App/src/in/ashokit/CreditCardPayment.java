package in.ashokit;

public class CreditCardPayment implements IPayment{

	@Override
	public String pay(double amount) {
		System.out.println(amount);
		return "payment successful through creditdcard";
	}

}
