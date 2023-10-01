package Day1;

class CurrentAccount extends Account{
  int creditLimit = 50000;
  @Override
  void withdraw(int amt){
      balance -= amt;
      System.out.println("The updated balance after withdrawal : "+balance);
  }
}
