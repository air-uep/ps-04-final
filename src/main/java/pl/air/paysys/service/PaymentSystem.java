package pl.air.paysys.service;

public class PaymentSystem {

    public void doPayment(Payable p) {
        System.out.println("Płatność:");
        System.out.println(" - kwota: " + p.getPaymentAmount() + " zł");
        System.out.println(" - opis: " + p.getPaymentDescription());
        System.out.println(" - wykonuję przelew w systemie elektronicznej bankowości");
    }

}
