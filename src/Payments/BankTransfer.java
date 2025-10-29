package Payments;

import java.util.ArrayList;

public class BankTransfer extends Payment{
    public String bankName;
    public String accountNumber;
    public String referenceCode;

    public BankTransfer(double amount,String currency,String Status,String bankName,String accountNumber,String referenceCode){
        super(amount, currency, Status);
        this.bankName=bankName;
        this.accountNumber=accountNumber;
        this.referenceCode=referenceCode;

    }

    @Override

    public void processPayment(){
        super.processPayment();
        System.out.println("Initiating bank transfer to"+ " " +this.bankName+ " " +"using account"+" " + this.accountNumber+ " " + "with reference"+ " " + this.referenceCode);
        this.marksCompleted();
    }

}
