class BankAccount 
{   
	private long   accnum;
	private String accHname;
	private double balance;
	
	void deposite(double amt){
		System.out.println("\n deposite() method is called");
		balance = balance + amt;
		alert(amt,"credited to");
	}
		
	void withdrow(double amt){
		System.out.println("\n withdrow() method is called");
		balance = balance - amt;
		alert(amt,"credited to");
	}
	void currrentbalance(){
		System.out.println(balance);
	}
	private void alert(double amt,String action){
		System.out.println("alert() method is called ");
		System.out.println(" "+amt+ "is" +action+ "your account");
		System.out.println();
	}
	void display(){
		System.out.println("accnum\t\t:"+accnum);
		System.out.println("accHname\t:"+accHname);
		System.out.println("accnum balance\t:"+balance);
	}
	
}
