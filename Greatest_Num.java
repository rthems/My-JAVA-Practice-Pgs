//Take three numbers from the user and print the greatest number. 

class Greatest_Num
{
    public static void main(String[] args)
    {
        Greatest_Num gn = new Greatest_Num();
            gn.Gnum(25,23,25);
    }
    
    void Gnum(int a, int b, int c)
    {
        if(a<b)
        {
            if(b<c)
            {
                System.out.println("The greatest number is c!!");
            } 
            else 
            {
                System.out.println("The greates number is b!!");
            } 
        }
        else if(a>c)
        {
            System.out.println("The greatest number is a!!");
        }
    }



}
