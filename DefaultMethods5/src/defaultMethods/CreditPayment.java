package defaultMethods;

public class CreditPayment implements PaymentService{

	@Override
	public void Pay(Double value) {
		System.out.println("Payment on credit: " + value);
		
	}
	@Override
	public boolean supportInstallments() {
			return true;
	}

}
