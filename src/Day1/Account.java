package Day1;

public abstract class Account {
	 int balance;
	    final int Acc_No = 123456789;
	    String holder;

	    public void deposit(int amt){
	        //concrete methods
	        balance += amt;
	        System.out.println("The updated balance is : "+balance);
	    }

	    abstract void withdraw(int amt); //abstract method
	    
	    public static void main(String[] args){
	        //Account a = new Account // we can't create variable of this because of abstract method
	        CurrentAccount ca = new CurrentAccount();
	        ca.deposit(10000);
	        ca.withdraw(1000);
	    }
}

//1. if there is a abstract method within class then the class must be defined as abstract
//2. we can't create object of abstract method

class CurrentAccount extends Account{
  int creaditLimit = 50000;
  @Override
  void withdraw(int amt){
      balance -= amt;
      System.out.println("The updated balance after withdrawal : "+balance);
  }
}