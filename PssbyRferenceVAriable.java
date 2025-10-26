class Axixmall
{
    void book()
    {
        System.out.println("Successfully ticket Booked!!");
    }
}
class SRK
{
    static void ticket(Axixmall a1)
    {
        a1.book();
        
    }
}
class DP
{
    static void ticket(Axixmall a2)
    {
        a2.book();
        
    }
}
class PssbyRferenceVAriable
{
    public static void main(String[] args)
    {
        Axixmall a = new Axixmall();
        SRK.ticket(a);
        DP.ticket(a);

    }
}  

