package defaultMethods;

public class Main {

	public static void main(String[] args) {
		
		PaymentService debit = new DebitPayment();
		debit.Pay(100.0);
		
		PaymentService credit = new CreditPayment();
		credit.payInstallment(300.0, 3);
		
		debit.payInstallment(300.0, 3);
		

	}

}
