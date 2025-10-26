public class Ellipse {
    double pi;
    double a;
    double b;
    double res;
    static void area(Ellipse x)
    {
        x.pi = 3.142;
        x.a = 5;
        x.b = 5;
        x.res =x.pi*x.a*x.b;
        System.out.println(x.res);
        
    }
    public static void main(String[] args) 
    {
        Ellipse e = new Ellipse();
        area(e);
    }
    
}
