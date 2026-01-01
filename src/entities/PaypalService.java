package entities;

public class PaypalService  implements OnlinePaymentService{
	public Double PaymentFee(Double amount) {
		return 0.02 * amount;
	}
	
	public Double interest(Double amount, Integer months) {
		
		return amount*0.01 *months;
	}
}
