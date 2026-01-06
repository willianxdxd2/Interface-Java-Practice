package defaultMethods;

public interface PaymentService {

	
	public void Pay(Double value);
	
	public default boolean supportInstallments() {
		return false;
	}
	public default void payInstallment(Double value,int installment) {
		if(!supportInstallments()) {
			throw new UnsupportedOperationException("This service do not support Installment: ");
		}
		if(installment <= 1) {
			Pay(value);
			return;
		}
		Double ValueInstallment = value / installment;
		for(int i = 1 ;i <= installment ; i++) {
			Pay(ValueInstallment);
			
		}
	}
	
}
