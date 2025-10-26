class Shape{
    void draw(){
        System.out.println("Can't determine the Shape");
    }
}
class Square extends Shape {
    @Override
    void draw(){
        System.out.println("It's a Square Shape");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Shape r = new Square();
        r.draw();
    }
    
}
