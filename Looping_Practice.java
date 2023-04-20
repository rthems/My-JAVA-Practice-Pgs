class Looping_Practice
{
    public static void main(String[] args)
    {
         Looping_Practice lpObj = new Looping_Practice();
         lpObj.find_reverse(1975);
         lpObj.find_count_of_digits(1975);
         lpObj.find_sum_of_digits(2023);   
         lpObj.find_reversethevalue(1234);
         lpObj.find_polindromenum(1221);
    }
    void find_polindromenum(int cake)
    {   int reverse=0,median=cake;
        while (cake>0)
        {
            int rem= cake%10;
            reverse = (reverse*10) + rem;
            cake=cake/10;
        }
           // System.out.println("The Reverse value of the given number " + reverse);
        if(reverse == median)
        {
            System.out.println("The given number is polindrome");
        }
        else
        {
           System.out.println("The given number is not a polindrome");
        }
           
     }
    
    void find_reversethevalue(int cake)
    {   int reverse=0;
        while (cake>0)
        {
            int rem= cake%10;
            reverse = (reverse*10) + rem;
            cake=cake/10;
        }
            System.out.println("The Reverse value of the given number " + reverse);
     }
    
     void find_sum_of_digits(int cake)
    {   int sum=0;
        while (cake>0)
        {
            //System.out.print(cake%10);
            sum  = sum+cake%10;
            cake = cake/10;
        }
        System.out.println("\n Sum of digits in given number: " +  sum);
    }
   
    
    void find_count_of_digits(int cake)
    {   int count=0;
        while (cake>0)
        {
            //System.out.print(cake%10);
            count=count+1;
            cake=cake/10;
        }
        System.out.println("\n Number of digits in given number: " +  count);
    }
    
    void find_reverse(int cake)
    {
        while (cake>0)
        {
            System.out.print(cake%10);
            cake=cake/10;
        }
    
    }
    
}
