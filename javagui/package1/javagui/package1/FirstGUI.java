package javagui.package1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

/**
 * FirstGUI
 */
public class FirstGUI {

    public static void main(String[] args) {    
        Abc obj = new Abc();
    }
}

class Abc extends JFrame {
    public Abc(){
        setLayout(new FlowLayout());
        JLabel l= new JLabel("Hello world");
        JLabel l1 =new JLabel("Welcome world");
    
        add(l);
        add(l1);
                setVisible(true);
            setSize(400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            
        }
}