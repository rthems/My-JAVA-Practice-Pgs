// Program for given number is odd or even
class OddEven
{
    public static void main(String[] args)
    {
        OddEven oe = new OddEven();
        oe.find_OE(452);
    }
    void find_OE(int num)
    {
        if(num%2==0)
        {
            System.out.println("The Given number is Even!!");
        }   
        else if(num%2==1)
        {
            System.out.println("The Given number is Odd!!");
        }             
                
    }


}
