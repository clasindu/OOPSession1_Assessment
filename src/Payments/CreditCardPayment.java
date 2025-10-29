package Payments;

public class CreditCardPayment extends CardPayment{
    public double creditLimit;

    public CreditCardPayment(double amount,String currency,String Status,String CN,String CHN,String ED,double CL){
        super(amount, currency, Status,CN,CHN,ED);
        this.creditLimit=CL;
    }

    @Override

    public void processPayment(){
        super.processPayment();
        System.out.println("Charging credit card with limit"+" " +this.creditLimit+" " + "for amount"+" " +this.amount);
    }

    public void applyInterest(){
        System.out.println("Applying interest if payment is not settled by due date");
    }

}
