class LogicalPrograms
{
    public static void main(String[] args)
    {
        LogicalPrograms lpObj= new LogicalPrograms();
        //lpObj.find_divisors(10);
        //lpObj.find_countdivs(10);
       // lpObj.find_primeornot(131);
        lpObj.find_multiples(2);
     }
     
    void find_multiples(int table)
    {   int num=1;
        while(num<=5)
        {
            System.out.println(+ table  + "*" + num + "=" +(table*num));
            num=num+1;
        }
        
    } 
     
    void find_primeornot(int num)
    {   int divisor=2,count=0;
        while(divisor<num)
        {
            if(num%divisor==0)
            {
                System.out.println(+divisor);
                count=count+1;
            }       
            divisor=divisor+1;
        }        
        System.out.println("Number of divisors are " +count);
        if(count==0)
        {
            System.out.println("The given number is a Primenumber");
        }
        else
        {
            System.out.println("The given number is not a Primenumer");
        }
        
     }
     
    void find_countdivs(int num)
    {   int divisor=2,count=0;
        while(divisor<num)
        {
            if(num%divisor==0)
            {
                System.out.println(+divisor);
                count=count+1;
            }       
            divisor=divisor+1;
        }        
        System.out.println("Number of divisors are " +count);
     }
       
    void find_divisors(int num)
    {   int divisor=2;
        while(divisor<num)
        {
            if(num%divisor==0)
            {
                System.out.println(+divisor);
            }       
            divisor=divisor+1;
        }        
    }
}







