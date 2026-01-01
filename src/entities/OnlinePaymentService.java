package entities;

public interface OnlinePaymentService {
	public  Double PaymentFee(Double amount);
	
	public  Double interest(Double amount, Integer months);
}
