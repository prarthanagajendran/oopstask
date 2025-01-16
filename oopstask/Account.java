package oopstask;

public class Account {
	
	
	
	String holderName = "Prarthana";
	long accountNumber = 123123;
	int balance;
	int amount_withdraw, amount_deposit;
	
	Account() 
	{
		balance = 0;
	}
	
    Account(int add_amt, int sub_amt) 
    {
		  amount_deposit = add_amt;
		amount_withdraw = sub_amt;
	}
    
    public int deposit()
    {
    	balance = balance + amount_deposit;
    	return balance;
    }
    
    public int withdraw()
    {
    	balance = balance - amount_withdraw;
    	return balance;
    }
	public static void main(String[] args) {
		Account account = new Account(2000, 200);
		System.out.println("Inital Available Account Balance : " + account.balance);
		account.deposit();
		System.out.println("Balance After Deposit : " + account.balance);
		account.withdraw();
		System.out.println("Balance After Withdraw : " + account.balance);
	}
}


output
Inital Available Account Balance : 0
Balance After Deposit : 2000
Balance After Withdraw : 1800

	


