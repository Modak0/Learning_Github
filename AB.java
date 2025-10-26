                        /* STATIC VARIABLE */
public class AB {

    static int x = 10; //static variable
    void fun(){
        int y = 10;
        System.out.println(x + " " + y);
        x++;
        ++y;
    }

    public static void main(String[] args) {
        AB ref = new AB();

        ref.fun();
        ref.fun();
        ref.fun();
    }
    
}
