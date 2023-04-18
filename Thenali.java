class Thenali
{
    public static void main(String[] args)
    {
        Thenali storyobj = new Thenali();
          //  storyobj.securities_count(1024);
          //  storyobj.flowers_count(7);
          //  storyobj.print_1();
            storyobj.Dosa_count();
    } 
    
    void Dosa_count()
    { 
        int leftover_dosas=8, no_of_meals=1,totaldosas_ate=0;
        
        float propotion=3/2f;
        float dosacount_eachmeal=0.0f;
        
        while(no_of_meals<=3)
        { 
          propotion = (((float)(leftover_dosas/3.0))*(propotion));
          
          dosacount_eachmeal=(float)leftover_dosas-propotion;
          
          leftover_dosas=leftover_dosas + (int)propotion;
          
          if(no_of_meals==1)
          {
            System.out.println("The Boy ate "  + dosacount_eachmeal +" Dosas at Dinner");
            totaldosas_ate = (totaldosas_ate + (int)dosacount_eachmeal);
            
          }
          else if(no_of_meals==2)
          
          {
            System.out.println("The Boy ate "  + dosacount_eachmeal +" Dosas at Lunch");
            totaldosas_ate = (totaldosas_ate + (int)dosacount_eachmeal);
          }
          else if(no_of_meals==3)
          
          {
            System.out.println("The Boy ate "  + dosacount_eachmeal +" Dosas at Breakfast");
            totaldosas_ate = (totaldosas_ate + (int)dosacount_eachmeal);
          }
          no_of_meals = no_of_meals+1;
          
          propotion=3/2f; 
        }
        
            System.out.println("\n The total number of Dosas Chef made "  + leftover_dosas);
            System.out.println("\n The total number of Dosas Boy ate in a day "  + totaldosas_ate);      
     }
    
 
    void print_1()
    {   int count=1;
        while(count<=500)
        {
            System.out.println(1 +" ");
            System.out.println("Total count:"+ count);
            count=count+1;
        }
        
    }
 
    void flowers_count(int temples)
    {
        int flowers_count =1;
        while(temples>0)
        {
          flowers_count=flowers_count*2;
          System.out.println("At" + temples +"th temple He has " + flowers_count +"flowers.");
          temples=temples-1;
        }
        System.out.println("Total flowers are :" +flowers_count);
            
    }
 
   void securities_count(int beats)
   {
    int securities=0;
    while(beats>1)
    {
        System.out.println( +securities + "Security gets " + beats/2 +"beats");
        securities=securities+1;     
        beats=beats/2;
    }
        System.out.println("Total Securities:" + securities);
   } 


}
