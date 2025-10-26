public class RefVariable{
    void demo(int x[])
    {
        for(int i=0; i<x.length; i++)
        {
            x[i] = x[i]+10;
        }
        System.out.println("Array");
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
        }

    }
    public static void main(String[] args) 
    {
        example obj = new example();
        int y[]= {5,3,4,5};
        obj.demo(y);
        System.out.println("Array");
        for(int i=0; i<y.length; i++)
        {
            System.out.println(y[i]);
        }

        
    }
   
}