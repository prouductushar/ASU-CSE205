class CheckingAccount extends BankAccount{
   private int overdraftFee;
   
   public CheckingAccount(){
      overdraftFee = 0;
   }
   
   public boolean debit(int pennies){
      currentBalance-=pennies;
      if(currentBalance<0){
         currentBalance-=overdraftFee;
      }
      return true;
   }
   
   public int getFee(){
      return overdraftFee;
   }
   
   public void setFee(int overdraftFee){
      this.overdraftFee = overdraftFee;
   }
   
   public void applyInterest(){
      if(currentBalance>=0){
         currentBalance+= currentBalance * interestRate;
      }
   }
   
   public String accountInfo(){
      String accInfo = "Type of Account : Checking%n";
      accInfo += "Account ID      : %s%n";
      accInfo += "Current Balance : $%.2f%n";
      accInfo += "Interest rate   : %.2f%%%n";
      accInfo += "Overdraft Fee   : $%.2f";
      return String.format(accInfo,accountID,(double)currentBalance/100.0,interestRate*100,(double)overdraftFee/100);
   }
}
