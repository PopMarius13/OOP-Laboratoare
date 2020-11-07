package Account;

import java.util.ArrayList;
import java.util.List;

public class MainAccount {

    public static void main(String[] args) {
        /// use account class
        Account myAccount = new Account(13);
        Account myAccount1 = new Account(1);
        myAccount.print();
        myAccount.deposit(103);
        myAccount.print();
        myAccount.withdraw(23);
        myAccount.print();
        System.out.println("Number account " + myAccount.getAccountNumber() + " balance " + myAccount.getBalance());
        System.out.println();

        // savingsAccount
        SavingsAccount mySavingsAccount = new SavingsAccount(23 , 2);
        SavingsAccount mySavingsAccount1 = new SavingsAccount(3 , 2);
        mySavingsAccount.print();
        mySavingsAccount.deposit(403);
        mySavingsAccount.print();
        System.out.println("Interest is " + mySavingsAccount.getInterest() + "%");
        System.out.println("New balance is: " + mySavingsAccount.addInterest());
        mySavingsAccount.print();
        System.out.println();

        // CurrentAccount
        CurrentAccount myCurrentAccount = new CurrentAccount(17 , 250);
        CurrentAccount myCurrentAccount1 = new CurrentAccount(7 , 250);
        myCurrentAccount.print();
        myCurrentAccount.deposit(400);
        myCurrentAccount.print();
        myCurrentAccount.withdraw(550);
        myCurrentAccount.print();
        myCurrentAccount.withdraw(300);
        myCurrentAccount.print();
        System.out.println();

        // Bank
        List<Account> myListBank = new ArrayList<>();
        //add in ListBank
        myListBank.add(myAccount);
        myListBank.add(myCurrentAccount);
        myListBank.add(mySavingsAccount);
        myListBank.add(myAccount1);
        myListBank.add(myCurrentAccount1);
        myListBank.add(mySavingsAccount1);
        /// print
        System.out.println(myListBank);
        // myBank
        Bank myBank = new Bank(myListBank);
        System.out.println(myBank);

        myBank.updateBank();
        System.out.println(myBank);

        // opening new account
        Account myNewAccount = new Account(9);
        myBank.openingAccount(myNewAccount);

        CurrentAccount myNewCurrentAccount = new CurrentAccount( 9 , 100);
        myBank.openingAccount(myNewCurrentAccount);

        System.out.println(myBank);

        myBank.closingAccountNumber(23);
        myBank.closingAccountNumber(9);
        myBank.closingAccountNumber(23);

        System.out.println(myBank);

    }

}
