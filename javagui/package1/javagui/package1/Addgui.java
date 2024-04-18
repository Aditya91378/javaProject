package javagui.package1;

import java.awt.FlowLayout;
 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addgui {
    public static void main(String[] args) {
        
        Addition obj= new Addition();
    }
}


 class Addition extends JFrame  { 
    JTextField t1;
    JTextField t2;
    JButton b; 
    JLabel l;
      public  Addition(){
        t1= new JTextField(15);
        t2= new JTextField(15);
        b= new JButton("OK");
        l= new JLabel ("Result");  
        add(t1);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(e-> {
                int num1 =Integer.parseInt(t1.getText());
                int num2 =Integer.parseInt(t2.getText());
                int result=num1+num2;
                l.setText(result+" ");});
            setLayout(new FlowLayout());
            add(l);
            setVisible(true);
            setSize(400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
   
}