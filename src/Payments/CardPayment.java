package Payments;

public class CardPayment extends Payment{
    public String cardNumber;
    public String cardHolderName;
    public String expiryDate;

    public CardPayment(double amount,String currency,String Status,String CN,String CHN,String ED){
        super(amount, currency, Status);
        this.cardNumber=CN;
        this.cardHolderName=CHN;
        this.expiryDate=ED;
    }

    @Override

    public void processPayment(){
        super.processPayment();
        System.out.println("Authorizing card payment for"+ " " +this.cardHolderName+ " " +" ...");
    }
    public void validateCard(){
        System.out.println("Validating card number format...");

    }

}
