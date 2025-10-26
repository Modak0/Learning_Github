public class zthread extends Thread {
    @Override
    public void run(){
        int x=10,y=15,z;
        z= x+y;
        System.out.println(z);
    }
    
}
class Sourav{
    public static void main(String[] args) {
        zthread obj = new zthread();
        obj.start();
    }
}
