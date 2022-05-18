import java.lang.Math;

class CreditcardAccount extends BankAccount{
   private int limit;
   
   public CreditcardAccount(){
      limit = 0;
   }
   
   public boolean debit(int pennies){
      if(currentBalance+pennies<=limit){
         currentBalance-=pennies;
         return true;
      }
      else{
         return false;
      }
   }
   
   public int getLimit(){
      return limit;
   }
   
   public void setLimit(int creditLimit){
      limit = creditLimit;
   }
   
   public void applyInterest(){
      if(currentBalance<0){
         currentBalance+=currentBalance*interestRate;
      }
   }
   
   public String accountInfo(){
      String accInfo = "Type of Account : Creditcard%n";
      accInfo += "Account ID      : %s%n";
      accInfo += "Current Balance : $%.2f%n";
      accInfo += "Interest rate   : %.2f%%%n";
      accInfo += "Credit Limit    : $%.2f";
      return String.format(accInfo,accountID,Math.abs((double)currentBalance/100.0),interestRate*100,(double)limit/100);
   }
}
