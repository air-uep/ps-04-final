package pl.air.paysys.model;

import lombok.*;
import pl.air.paysys.service.Payable;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Invoice implements Payable {
	
	private String no;
	private LocalDate issueDate;
	private String seller;
	private double totalAmount;


	// ********** Payable **********

	@Override
	public double getPaymentAmount() {
		double payment = totalAmount;
		return payment;
	}
	
	@Override
	public String getPaymentDescription() {
		return "Faktura nr " + no + ", sprzedawca - " + seller;
	}

}
