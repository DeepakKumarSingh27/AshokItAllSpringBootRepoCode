package in.ashokit;

import javax.sound.midi.Soundbank;

public class DebitcardPayment implements IPayment {

	
	public DebitcardPayment() {
		System.out.println("DebitCard Constructor");
	}

	@Override
	public String pay(double amount) {
       System.out.println(amount);
		return "Payment successful through debitcard";
	}

}
