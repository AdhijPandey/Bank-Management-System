class BankMain 
{
	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
		acc1.display();
		acc1.deposite(76399);
		acc1.withdrow(678);
		System.out.println("\n acc1 balance:");
		acc1.currrentbalance();
		
	}
}
