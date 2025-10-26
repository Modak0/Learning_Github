public class xthread extends Thread {
    
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
class ythread extends Thread {
    
    public void run(){
        for(int i=10;i>=1;i--){
            if(i==6){
                try{
                    Thread.sleep(3000);
                }
                catch(InterruptedException a){
                    System.out.println(a);
                }
                
            }
        System.out.println(i);    
        }
    }
}

class C{
    public static void main(String[] args) {
        xthread obj = new xthread();
        obj.start();
        ythread obj1 = new ythread();
        obj1.start();

    }
}