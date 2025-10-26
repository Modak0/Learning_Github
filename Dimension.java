class Dimension1{
    int area(int a,int b){
        return 0;
    }
}
class Rectangle extends Dimension1{
    @Override
    int area(int a,int b){
        return a*b;

        //int len=20, wid=20;
       // System.out.println("Area of Rectangle is " + len*wid );
    }
}
class Triangle extends Dimension1{
    @Override
    int area(int a,int b){
        return (a*b)/2; 
        //  int len=30,hei=20;
        // System.out.println("Area of Triangle is " +  (len*hei)/2);
    }
}
public class Dimension {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        System.out.println("Area of Rectangle is " + r.area(10,5)); 
        System.out.println("Area of TRiangle is " + t.area(4,5)); 
        
        
    }
}
