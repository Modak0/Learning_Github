import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame {   //extending frame & for output we use ActionListener event
    JLabel label1,label2,label3,label4,label5,label6;
    JTextField t1,t2;
    JRadioButton male,female;
    JComboBox day,month,year;
    JComboBox code;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    Myframe(){                  //making a constructor of MyFrame class 
        setTitle("REGISTRATION FORM");
        setSize(600,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        
//Name
        label1 = new JLabel("Name:");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);
//Mobile
        label2 = new JLabel("Mobile:");
        label2.setBounds(20,100,100,20);
        c.add(label2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);
//Gender
        label3 = new JLabel("Gender:");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male = new JRadioButton("Male");
        male.setBounds(130,150,80,20);
        c.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(210,150,80,20);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);
//DOB
        label4 = new JLabel("DOB:");
        label4.setBounds(20,200,100,20);
        c.add(label4);

        String[] days ={"1","2","3","4","5","6","7","8","9","10","11","12","13","!4","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        day = new JComboBox(days);
        day.setBounds(130,200,50,20);
        c.add(day);

        String[] months ={"Jan","Feb","Mar","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec","Dip"};
        month = new JComboBox(months);
        month.setBounds(190,200,50,20);
        c.add(month);

        String[] years = {"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999"};
        year = new JComboBox(years);
        year.setBounds(250,200,60,20);
        c.add(year);
//interested in
        label6 = new JLabel("Interested in:");
        label6.setBounds(20,250,90,20);
        c.add(label6);

        String[] code1 = {"C","C++","Java","HTML","CSS","Java Script"};
        code = new JComboBox(code1);
        code.setBounds(130,250,50,20);
        c.add(code);
//Adress
        label5 = new JLabel("Address:");
        label5.setBounds(20,300,100,20);
        c.add(label5);

        ta1 = new JTextArea();
        ta1.setBounds(130,300,200,50);
        c.add(ta1);
//Checkbox       
        terms = new JCheckBox("please accept Terms & Condition");
        terms.setBounds(130,360,500,20);
        c.add(terms);
//submit
        submit = new JButton("Submit");
        submit.setBounds(200,400,80,20);
        c.add(submit);

        setVisible(true);
    }

}

public class RegistrationForm {
    public static void main(String[] args) {
        Myframe obj = new Myframe();   
    }
}
