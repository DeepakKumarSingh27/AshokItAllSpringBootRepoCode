package in.ashokit;

public class CreditCardPayment implements IPayment{
	

	public CreditCardPayment() {
		System.out.println("Credit Card Constructor");
	}

	@Override
	public String pay(double amount) {
		System.out.println(amount);
		return "payment successful through creditdcard";
	}

}
