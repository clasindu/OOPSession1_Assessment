package Payments;

import java.util.ArrayList;

public class CashOnDelivery extends Payment {
    public ArrayList<String> deliveryAddress;

    public CashOnDelivery(double amount, String currency, String Status, ArrayList<String> Addresses) {
        super(amount, currency, Status);
        this.deliveryAddress=Addresses;


    }
    @Override

    public void processPayment(){
        System.out.println("Cash will be collected at delivery address: <address>" + this.deliveryAddress);


    }
}

