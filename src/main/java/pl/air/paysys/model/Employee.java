package pl.air.paysys.model;

import lombok.*;
import pl.air.paysys.service.Payable;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Employee implements Payable {
	
	private String fullName;
	private double salary;
	private double allowance;

	
	// ********** Payable **********

	@Override
	public double getPaymentAmount() {
		double zus = 9.76 + 1.50 + 2.45 + 0.0 + 9.0;     // Rodzaj ubezpieczenia: Emerytalne + Rentowe + Chorobowe + Wypadkowe + Zdrowotne;
		double tax = 17.0;

		double total = salary + allowance;
		double payment = total - total * (zus / 100.0);
		payment = payment - payment * (tax / 100.0);

		return payment;
	}
	
	@Override
	public String getPaymentDescription() {
		return "Wynagrodzenie - " + fullName;
	}
	
}
