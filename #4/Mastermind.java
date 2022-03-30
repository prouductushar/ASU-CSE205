import java.util.Random;

public class Mastermind{
  
   private int secret;
   private int guesses;
      
   public Mastermind(){
      guesses = 0;
      secret = 0;
   }
      
   public void makeNewSecret(){
      secret = createSecret();
   }
      
   public int guess(int g){
      int i = 1;
      int count = 0;
      while(g!=0){
         if(g%10==(secret/i)%10){
            count++;
         }
         g=g/10;
         i*=10;
      }
      guesses++;
      return count;
   }
      
   public int getGuessCount(){
      return guesses;
   }
      
   private int createSecret(){
      int x = 0;
      x = x* 10 + getDigit();
      x = x* 10 + getDigit();
      x = x* 10 + getDigit();
      x = x* 10 + getDigit();
      return x;
   }
      
   private int getDigit(){
      double x = Math.random()*10;
      return (int)x;
   }
}
