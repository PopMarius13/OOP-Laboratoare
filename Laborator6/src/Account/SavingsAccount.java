package Account;

public class SavingsAccount  extends  Account{
    private double interest;

    public SavingsAccount(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    private double interestUpdate (){
        return this.getBalance() * this.interest / 100.0;
    }

    public double addInterest (){
        this.setBalance(this.getBalance() + interestUpdate());
        return this.getBalance();
    }

    @Override
    public void deposit(double sum) {
        if(sum > 0){
            this.setBalance(sum);
            super.deposit( interestUpdate());
         }else {
            super.deposit(-1);
        }
    }
}
