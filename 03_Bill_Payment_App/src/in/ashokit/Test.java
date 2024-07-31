package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// BillCollector bc = new BillCollector();
		// bc.setiPayment(new CreditCardPayment());
		// BillCollector bc1 = new BillCollector(new CreditCardPayment());
		// bc1.collectPayment(1500.00d);

		// CreditCardPayment ccd = new CreditCardPayment();
		// BillCollector bc = new BillCollector();
		// bc.iPayment = ccd;
		// bc.collectPayment(20000.000d);

		/*
		 * Class<?> clz = Class.forName("in.ashokit.BillCollector"); Object obj =
		 * clz.newInstance(); BillCollector bc = (BillCollector) obj; Field field =
		 * clz.getDeclaredField("iPayment"); field.setAccessible(true); field.set(obj,
		 * new DebitcardPayment()); bc.collectPayment(20000.0000d);
		 */
		// dependent class obj
		CreditCardPayment ccd = new CreditCardPayment();
		
		// target class obj
		BillCollector collector = new BillCollector();
		
		// injecting dependent cls into target cls obj
		collector.setiPayment(ccd);
		collector.collectPayment(22000);

	}

}
