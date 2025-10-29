package Payments;

public class Payment {
    public double amount;
    public String currency;
    public String status;

    public Payment(double amount,String currency,String PENDING){
        this.amount=amount;
        this.currency=currency;
        this.status=PENDING;
    }

    public void processPayment(){
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt(){
        System.out.println("Receipt for amount" +this.amount +" "+ "currency" + this.currency);


    }
    public void marksCompleted(){
        this.status= "COMPLETED";
        System.out.println("Payment status completed" + " " +this.status);
    }


}
