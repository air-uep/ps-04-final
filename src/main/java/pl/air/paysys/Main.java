package pl.air.paysys;

import pl.air.paysys.model.Contract;
import pl.air.paysys.model.Employee;
import pl.air.paysys.model.Invoice;
import pl.air.paysys.service.PaymentSystem;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jan Kowalski", 5100, 1000);
        Employee e2 = new Employee("Anna Nowak", 9500, 0);

        Contract c1 = new Contract("U/2022/03/15", "Julia Kus", 3000);
        Contract c2 = new Contract("U/2022/02/10", "Marek Mostowiak", 400);

        Invoice i1 = new Invoice("P/20229876", LocalDate.of(2022, 2, 26), "ENEA", 5300);
        Invoice i2 = new Invoice("89-02-2022", LocalDate.of(2022, 3, 10), "Czystość i Błysk", 9000);

        PaymentSystem ps = new PaymentSystem();
        ps.doPayment(e1);
        ps.doPayment(e2);
        ps.doPayment(c1);
        ps.doPayment(c2);
        ps.doPayment(i1);
        ps.doPayment(i2);
    }

}
