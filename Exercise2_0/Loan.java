package Exercise2_0;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        annualInterestRate=2.5;
        numberOfYears=2;
        loanAmount=1500;
        loanDate=new Date();
    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        loanDate=new Date();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
    public void setAnnualInterestRate(){
        this.annualInterestRate=annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public void setLoanDate(){
        this.loanDate=loanDate;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        double monthlyPayment=loanAmount*monthlyInterestRate
                / (1-1 / Math.pow(1+monthlyInterestRate,numberOfYears*12));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        return getMonthlyPayment()*numberOfYears*12;
    }
}


class testLoan{
    public static void main(String[] args) {
        Loan loan = new Loan(5.0, 2, 10000);
        System.out.println("Loan date: " + loan.getLoanDate());
        System.out.printf("Monthly payment: %.2f%n", loan.getMonthlyPayment());
        System.out.printf("Total payment: %.2f%n", loan.getTotalPayment());

        Loan def = new Loan();
        System.out.printf("Default loan monthly payment: %.2f%n", def.getMonthlyPayment());

    }
}
