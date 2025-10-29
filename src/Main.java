import Payments.BankTransfer;
import Payments.CashOnDelivery;
import Payments.CreditCardPayment;
import Payments.DebitCardPayment;
import Payments.Payment;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args){

        CashOnDelivery Cash = new CashOnDelivery(25000,"LKR","COMPLETED","Newtown Ratnapura");
        Cash.processPayment();
        Cash.generateReceipt();

        BankTransfer Bank    = new BankTransfer(35000,"LKR","COMPLETED","CommercialBank","12345","23");
        Bank.processPayment();
        Bank.generateReceipt();


        CreditCardPayment Credit=new CreditCardPayment(45000,"LKR","COMPLETED","123456778","CHAMATHLASINDU","23/30",1000000);
        Credit.processPayment();
        Credit.generateReceipt();


        DebitCardPayment Debit = new DebitCardPayment(15000,"LKR","COMPLETED","800272982","udesh","12/27",100);
        Debit.processPayment();
        Debit.generateReceipt();


        System.out.println("=== Payment Processing System ===\n");

        List<Payment> payments = new ArrayList<>();
        payments.add(new CashOnDelivery(25000,"LKR","COMPLETED","Newtown Ratnapura"));
        payments.add(new BankTransfer(35000,"LKR","COMPLETED","CommercialBank","12345","23"));
        payments.add(new CreditCardPayment(45000,"LKR","COMPLETED","123456778","CHAMATHLASINDU","23/30",1000000));
        payments.add(new DebitCardPayment(15000,"LKR","COMPLETED","800272982","udesh","12/27",100));

        for (Payment p : payments) {
            p.processPayment();
            p.generateReceipt();
            System.out.println("------------------------\n");
        }
    }



}
