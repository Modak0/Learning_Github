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
// class Student {
//     int id;
//     String name;

//     Student() {
//         this(101, "John");
//         System.out.println("Default constructor called");
//     }

//     Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
// }
