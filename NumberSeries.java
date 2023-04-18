class NumberSeries
{
    public static void main(String[] args)
    {
        NumberSeries nsObj= new NumberSeries();
        nsObj.countby_two();
        nsObj.countby_three();
        nsObj.cbythree_fromthree();
        nsObj.multiplybyeleven();
    }
    
 void countby_two()
 { int num=1,pattern=0;
    System.out.println("\n The pattern of even numbers are:");
    while (num<=5)
    {
        num=num+1;
        pattern=pattern+2;
        System.out.print(+pattern +" ");
    }

 }
 void countby_three()
 {
    int num=1,pattern=1;
    System.out.println("\n The pattern count by three numbers are:");
    while (num<=5)
    {
        System.out.print( +pattern +" " );
        num=num+1;
        pattern=pattern+3;
        
    }

 }
 void cbythree_fromthree()
 {
    int num=3;
    System.out.println("\n The pattern count by three from 3 to 15 are:");
    while (num<=15)
    {
        System.out.print( +num +" " );
        num=num+3;
    }
 }
 void multiplybyeleven()
 {
    int num=1;
    System.out.println("\n The pattern multiply by eleven numbers are:");
    while (num<=1331)
    {
        System.out.print( +num +" " );
        num=num*11;
    }
    
 }

}
