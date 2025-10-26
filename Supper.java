class Supper
{
    void disp1()
    {
        System.out.println("its Non-static..");
    }
    static void disp2(Supper s1)
    {
        s1.disp1(); 
        System.out.println("its Static..");
    }
    public static void main(String[] args) 
    {
        Supper s = new Supper();
        disp2(s);  
    }
}