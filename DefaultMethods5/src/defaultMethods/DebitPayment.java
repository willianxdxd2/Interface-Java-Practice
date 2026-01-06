package defaultMethods;

public class DebitPayment implements PaymentService{

	@Override
	public void Pay(Double value) {
		
		System.out.println("Payment on Debit: R$" + value);
		
		
	}

}
