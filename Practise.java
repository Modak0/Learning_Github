class Practise {
    int a;
    void Test(int a)
    {
        this.a = a;
    }

    void Run()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Practise obj = new Practise();
        obj.Test(5);
        obj.Run();
    }
    
}

