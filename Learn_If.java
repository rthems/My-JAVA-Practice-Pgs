class Learn_If
{
public static void main(String[] args)
{
    Learn_If li = new Learn_If();
    li.find_highest_scorer(90,95);
}


void find_highest_scorer(int vk,int msd)
{
    //int vk =90;
    //int msd=90;
    if(vk>msd)
    {
        System.out.println("ViratKoli is the highest scorer!!");
    }
    else if(msd>vk)
    {
        System.out.println("Dhoni is the highest scorer!!");
    }
    else 
    {
        System.out.println("Virat Koli and M.S.Dhoni are Equal!!!!");
    }
}
}
