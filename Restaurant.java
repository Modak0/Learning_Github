abstract class A{
    abstract void UN();
    abstract void PWD();
}
class B extends A{
    void UN()
    {
        System.out.println("HI User Name");
    }
    void PWD()
    {
        System.out.println("HEllo Password");
    }
}
public class Restaurant
{
    public static void main(String[] args) {
        B b = new B();
        b.UN();
        b.PWD();
    }
}