public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(250);
  }

  public static void coinConverter(int pennies) 
  {
    int dollars = pennies/100;
    pennies %= 100;

    int quarters = pennies/25;
    pennies %= 25;

    int dimes = pennies/10;
    dimes %= 10;

    int nickels = pennies/5;
    nickels %= 5;

    int leftover = nickels;

   System.out.println("Dollars:" + dollars);
   System.out.println("Quarters:" + quarters);
   System.out.println("Dimes:" +  dimes);
   System.out.println("Nickels:" + nickels);
   System.out.println("Pennies:" + leftover);
  }

}
