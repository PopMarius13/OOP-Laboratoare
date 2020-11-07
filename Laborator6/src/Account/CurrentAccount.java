package Account;

public class CurrentAccount extends Account {
    private final double limitOverdraft;

    public CurrentAccount(int number, double limitOverdraft) {
        super(number);
        this.limitOverdraft = limitOverdraft;
    }

    @Override
    public void withdraw(double sum) {
        if(this.getBalance() + limitOverdraft > sum){
            super.withdraw(sum);
        }else{
            System.out.println("The amount is too high");
        }
    }
}
