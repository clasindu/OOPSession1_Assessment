package Payments;


public class CashOnDelivery extends Payment {
    public String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String Status, String Addresses) {
        super(amount, currency, Status);
        this.deliveryAddress=Addresses;


    }
    @Override

    public void processPayment(){
        super.processPayment();
        System.out.println("Cash will be collected at delivery address: " + this.deliveryAddress);


    }

    public void generateReceipt(){
        super.generateReceipt();
    }
}

