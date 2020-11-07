package Account;

import java.util.List;

public class Bank {
    private final List<Account> listAccounts;

    public Bank(List<Account> listAccounts) {
        this.listAccounts = listAccounts;
    }

    public void updateBank (){
        for(Account a : listAccounts){
            if(a.getClass() == SavingsAccount.class){
                ((SavingsAccount)a).addInterest();
            }else if(a.getClass() == CurrentAccount.class){
                System.out.println("Letter: You are in overdraft (" + a.getAccountNumber() + ")" );
            }
        }
    }

    public void openingAccount (Account s){
        int ok = 1;
        for(Account a : listAccounts){
            if(a.getAccountNumber() == s.getAccountNumber()){
                ok = 0;
                break;
            }
        }
        if(ok == 1)
            listAccounts.add(s);
        else
            System.out.println("This number account (" + s.getAccountNumber() + ") already exist" );
    }
    public void closingAccountNumber(int number){
        int ok = 0;
        for(Account a : listAccounts){
            if(a.getAccountNumber() == number){
                listAccounts.remove(a);
                ok = 1;
                break;
            }
        }
        if(ok == 0)
            System.out.println("This number account not exist");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "listAccounts=" + listAccounts +
                '}';
    }
}
