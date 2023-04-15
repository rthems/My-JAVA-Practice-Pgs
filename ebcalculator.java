class EBCalculator
{
EBCalculator asseser = new EBCalculator();
 public static void main( String[] args)
 {
     
      int bill= asseser.calculate_units();
      System.out.println("one" + bill);
      int amount = 500;
//      int balance = amount-bill;
//      System.out.println(balance);
         asseser.pay(amount,bill);
        
 }
  int calculate_units()
  {
       int units=150;
       int price = 2;
       System.out.println("Three" + (units*price));
       return units*price;
   }
   void pay(int amt,int bill_1)
   {
   
        System.out.println("Two" + (amt-bill_1));
   
   }

}
