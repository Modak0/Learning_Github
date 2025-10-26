
abstract class Animal{

    Animal(){
        System.out.println("Sourav is doing Abstraction");
    }
   public abstract void sound();
        
}
class Dog extends Animal{
    
    Dog(){
        super();
    }
    public void sound(){
        System.out.println("Dog is barking");
    }

}
class Tiger extends Animal{
    Tiger(){
        super();
    }
    public void sound(){
        System.out.println("Tiger roar!");
    }
}

public class Abstract{
    public static void main(String[] args){

        Dog d = new Dog();
        Tiger t = new Tiger();
        d.sound();
        t.sound();
    }
    
}
