import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
class MyForm extends JFrame {
    Label namelbl,emaillbl,rolllbl,phonelbl,branchlbl,interestlbl,msglbl;
    TextField name,email,roll,phone;
    TextArea msg;
    Checkbox cse,ece,it,java,cpp,python;
    CheckboxGroup brnch;
    Button submit;
    MyForm() {
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Registration Form");

        
        emaillbl=new Label("Email Id");
        emaillbl.setBounds(100,150,100,30);
        add(emaillbl);
        email=new TextField("");
        email.setBounds(250,150,100,30);
        add(email);

        namelbl=new Label("Name");
        namelbl.setBounds(100,100,100,30);
        add(namelbl);
        name=new TextField("");
        name.setBounds(250,100,100,30);
        add(name);


        rolllbl=new Label("Roll Number");
        rolllbl.setBounds(100,200,100,30);
        add(rolllbl);
        roll=new TextField("");
        roll.setBounds(250,200,100,30);
        add(roll);

        phonelbl=new Label("Phone Number");
        phonelbl.setBounds(100,250,100,30);
        add(phonelbl);
        phone=new TextField("");
        phone.setBounds(250,250,100,30);
        add(phone);

        branchlbl=new Label("Branch");
        branchlbl.setBounds(100,300,100,30);
        add(branchlbl);
        brnch=new CheckboxGroup();
        cse=new Checkbox("CSE",brnch,true);
        cse.setBounds(250,300,50,20);
        add(cse);
        ece=new Checkbox("ECE",brnch,true);
        ece.setBounds(300,300,50,20);
        add(ece);
        it=new Checkbox("IT",brnch,true);
        it.setBounds(350,300,50,20);
        add(it);

        interestlbl=new Label("Interested In");
        interestlbl.setBounds(100,350,100,30);
        add(interestlbl);
        java=new Checkbox("JAVA");
        java.setBounds(250,350,50,20);
        add(java);
        cpp=new Checkbox("C++");
        cpp.setBounds(300,350,50,20);
        add(cpp);
        python=new Checkbox("PYTHON");
        python.setBounds(350,350,100,20);
        add(python);

        msglbl=new Label("Message");
        msglbl.setBounds(100,400,100,30);
        add(msglbl);
        msg=new TextArea(10,20);
        msg.setBounds(250,400,200,50);
        add(msg);

        submit=new Button("Submit");
        submit.setBounds(200,500,50,20);
        add(submit);
    }
}
public class RegForm {
    public static void main(String[] str) {
        MyForm regform = new MyForm();
    }
}