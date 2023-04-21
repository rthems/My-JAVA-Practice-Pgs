class Numbers_Practice
{
    public static void main(String[] args)
    {
        Numbers_Practice npObj = new Numbers_Practice();
            npObj.find_armStrong(154);
        int givennum    = 4;
        //npObj.find_neonNumber(9);
        int squareofnum = npObj.find_power(givennum,2);
        int sumofdigits = npObj.find_sumofdigits(squareofnum);
        
        if(sumofdigits== givennum)
        {
            System.out.println("Given number is Neon number" +givennum);
        }
        else
        {
            System.out.println("Given number is not a Neon number" +givennum);
        }
    }
     int find_sumofdigits(int num)
    { int sum=0, rem;
      while(num >0)
      {
        rem= num%10;
        sum=sum+rem;
        num=num/10;
      }
       return sum;
    
    }
    int find_power(int base,int power)
    {  int box=1;
       while(power>0)
       {  
         box=box*base;
         power=power-1;   
       } 
         return box;
        //System.out.println("The Result:" + box);
    }
    
    void find_armStrong(int num)
    {  int snum=num, armnum=0,rem;
       while(num > 0)
       {
             rem = num % 10;
             armnum = armnum + (rem*rem*rem);
             num=num/10;
       }
        if(armnum==snum)
        {
            System.out.println("The given number is ArmStrong number!!!");
        }
        else
        {
            System.out.println("The given number is not a ArmStrong number!!!");
        }
    }
}
