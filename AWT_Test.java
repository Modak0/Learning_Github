import java.awt.*;
public class AWT_Test extends Frame{

    Label name,gender;
    TextField t1;
    Button submit;
    
    AWT_Test(){
        setVisible(true);
        setSize(600,600);
        setTitle("AWT PROGRAM");

        name = new Label("Enter Name : ");
        name.setBounds(100,150,100,30);
        add(name);

        t1 = new TextField("");
        t1.setBounds(250,150,100,30);
        add(t1);

        gender = new Label("Gender");
        gender.setBounds(100,170,100,30);
        add(gender);

        submit = new Button("Submit");
        submit.setBounds(50,50,40,20);
        //add(submit);
         
    }


    public static void main(String[] args) {
        AWT_Test obj = new AWT_Test();
           
    }
}