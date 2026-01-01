package entities;

public class ContractService {
	private Contract contract;
	private Integer months;
	private OnlinePaymentService onlinePaymentService;
	
	public void processContract(Contract contract,Integer Months) {
		OnlinePaymentService service = new PaypalService();
		
		Double Parcela = contract.getTotalValue() / Months;
		
		for(int i = 1 ; i < Months+1 ; i++) {
			
			
			Double juros = service.interest(Parcela, i);
			Double fee = service.PaymentFee(Parcela + juros);
			Double parcelaFinal = Parcela + juros + fee;
			
			
			
			
			System.out.println(contract.getDate().plusMonths(i) + " - " + String.format("%.2f", parcelaFinal));	
				
				
		}
				
	}
}
