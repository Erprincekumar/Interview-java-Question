//Bankaccount.java(Encapsulation class)
class BankAccount 
{
	private double balance;
	public void setBalance(double balance){
    if(balance<=0)
		System.out.println("Do not enter -ve Amount:");
	else
		this.balance=balance;
	}
	public double getBalance()
	{
     return balance;
	}
	
}
