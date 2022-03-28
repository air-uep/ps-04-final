package pl.air.paysys.model;

import lombok.*;
import pl.air.paysys.service.Payable;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Contract implements Payable {
	
	private String no;
	private String contractor;
	private double amount;

	
	// ********** Payable **********

	@Override
	public double getPaymentAmount() {
		double earningCost = 20.0;
		double tax = 17.0;
		
		double payment = amount - amount * (earningCost / 100.0);
		payment = payment - payment * (tax / 100.0);

		return payment;
	}
	
	@Override
	public String getPaymentDescription() {
		return "Umowa nr " + no + ", wykonawca - " + contractor;
	}

}
