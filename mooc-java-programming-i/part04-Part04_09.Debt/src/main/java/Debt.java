public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialRate, double initialInterestRate){
        this.balance = initialRate;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance = this.balance*this.interestRate;
        
    }

}
