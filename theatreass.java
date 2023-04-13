class Theatre
{
    public static void main(String[] args)
    {
        Theatre rohini_theatre = new Theatre();
            rohini_theatre.show(120,4);
    }
    
    void show (int ticket_price ,int no_of_persons)
    {   int total_cost;
        total_cost= ticket_price*no_of_persons;
        System.out.println(total_cost);
    }
    
        

}
