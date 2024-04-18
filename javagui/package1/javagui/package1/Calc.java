package javagui.package1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calc {
    public static void main(String[] args) {
        AddSub obj= new AddSub();
    }
}

class AddSub extends JFrame {
    JTextField t1;
    JTextField t2;
    JButton b1,b2; 
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
    public AddSub(){
        t1= new JTextField(15);
        t2= new JTextField(15);
        b1= new JButton("Add");
        b2= new JButton("Sub");
        l= new JLabel ("Result");  
      
        add(t2);
        add(b1);
        add(b2);
    
    

        b1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent   ae){
                int num1 =Integer.parseInt(t1.getText());
                int num2 =Integer.parseInt(t2.getText());
                int result;
                            result=num1+num2;
                            
                        l.setText(result+" ");
            }
    
            
        });
        b2.addActionListener(e  ->
            {
                int num1 =Integer.parseInt(t1.getText());
                int num2 =Integer.parseInt(t2.getText());
                int result;
                       
                            result=num1-num2;
                        l.setText(result+" ");
            }
    
            
        );

        setLayout(new FlowLayout());
        JLabel l= new JLabel ("Hello");
        add(l);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}