package Payments;

public class DebitCardPayment extends CardPayment{
    public double avialableBalance;


    public DebitCardPayment(double amount,String currency,String Status,String CN,String CHN,String ED,double aB){
        super(amount, currency, Status,CN,CHN,ED);
        this.avialableBalance=aB;

    }
    @Override


    public void processPayment(){
        super.processPayment();
        System.out.println("Debiting from account balance"+" " +this.avialableBalance+ " " + "for amount"+" " +this.amount);
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }


}
