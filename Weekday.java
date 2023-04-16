//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. 

class Weekday
{
    public static void main(String[] args)
    {
        Weekday wd = new Weekday();
        wd.wdName(30);
    }  
    
    void wdName(int num)
    {
        if ((num >=1)&&(num <=7))
        {
            if (num == 1)
            {
                System.out.println(" Sunday");
            }
            else if(num==2)
            {
                System.out.println("Monday");
            }
            else if(num==3)
            {
                System.out.println("Tuesday");
            }
            else if(num==4)
            {
                System.out.println("wednesday");
            }
            else if(num==5)
            {
                System.out.println("Thursday");
            }
            else if(num==6)
            {
                System.out.println("Friday");
            }
            else if(num==7)
            {
                System.out.println("Saturday");
            }
       }
       else
       {
         System.out.println("Invalid number to display the name of the weekday, Please give the number between 1 and 7");
       }
    }
}
