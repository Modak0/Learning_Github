class A extends Thread {
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                System.out.println("Sourav Modak");
            Thread.sleep(1000);
            }
            catch(InterruptedException a){

            }
        }
    }
}
class B {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Modak");
            Thread.sleep(1000);
        }
        
    }
}