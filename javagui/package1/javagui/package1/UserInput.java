package javagui.package1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class UserInput {
    
    public static void main(String[] args) {
        RadioDemo obj= new RadioDemo();
    }
}

 class RadioDemo extends JFrame {
    JCheckBox c1,c2;
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
    /**
     * 
     */
    public RadioDemo(){
        t1= new JTextField(15);
        b= new JButton("Ok");
        r1 =new JRadioButton("Male");
        r2=new JRadioButton("Female");
        l=new JLabel("Greeting");
        c1= new JCheckBox("Dancer");
        c2= new JCheckBox("Singer");
        add(t1);
        add(r1);
        add(r2);
        add(b);  
        add(c1);
        add(c2);
        add(l);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        b.addActionListener(new ActionListener() {
            
    
            public void actionPerformed(ActionEvent e)
            {
                String name= t1.getText();
                if(r1.isSelected()){
                    name ="Mr. " +name;
                }
                else {
                    name= "Ms. " +name;
                }
                if(c1.isSelected()){ 
                    name ="Dancer " +name;
                }
                if(c2.isSelected()){
                    name ="Singer. " +name;
                }
                l.setText(name);
            }
        });
    
        setLayout(new FlowLayout());
        // JLabel l1= new JLabel ("Hello");
        // add(l1);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}