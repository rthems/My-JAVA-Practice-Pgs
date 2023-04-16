//Write a Java program a number from the user and print whether it is positive or negative. 
class Positive_Negative
{
    public static void main(String[] args)
    {
        Positive_Negative pn = new Positive_Negative();
        pn.findoutpn(-23);
    }
    void findoutpn(int num)
    {
            if (num>0)
            {
                System.out.println("The given number is Positive number!!");
            }
            else
            {
                System.out.println("The given number is Negative number!!");
            }
    }
}
