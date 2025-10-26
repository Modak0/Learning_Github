                                        // THREAD by using extending class Thread \\

class  Add extends Thread{
     public void run(){
        int a=15;
        int b=15;
        System.out.println(a+b);
    }
}
class Div extends Thread{
    public void run(){
       int a=15;
       int b=15;
       System.out.println(a/b);
   }
}
public class newthread  {
    public static void main(String[] args) {
        Add obj = new Add();
        Div obj1= new Div();
        obj.start();
        obj1.start();
    }

}
