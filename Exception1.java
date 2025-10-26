public class Exception1 {

    void div(int a, int b) throws ArithmeticException
    {
        if(b>a){
            throw new ArithmeticException();
        }
        else{
            int c = a-b;
            System.out.println(c);
        }
        
    }
    public static void main(String[] str){
        Exception1 t = new Exception1();
        try{
            t.div(20,12);
        }
        catch(Exception n){
            System.out.println("OOOOO BHAi Exception!");
        }

    }
    
}
