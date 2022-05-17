class SavingsAccount extends BankAccount{
  
   public boolean debit(int pennies){
     
      if(currentBalance>=pennies){
         currentBalance-=pennies;
         return true;
      }
     
      else{
         return false;
      }
     
   }
   
   public void applyInterest(){
      currentBalance += currentBalance * interestRate;
   }
   
   public String accountInfo(){
      String accInfo = "Type of Account : Savings%n";
      accInfo += "Account ID      : %s%n";
      accInfo += "Current Balance : $%.2f%n";
      accInfo += "Interest rate   : %.2f%%";
      return String.format(accInfo,accountID,(double)currentBalance/100.0,interestRate*100);
   }
}
