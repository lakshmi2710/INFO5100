package Assignment8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField; 

class BasicCalculator extends JFrame implements ActionListener { 
    static JFrame f; 
    static JTextField t; 
  
    String str1="";
    String str2="";
    String str3="";
    
    BasicCalculator(){}
 
    public static void main(String args[]) 
    { 
        f = new JFrame("BasicCalculator"); 
        BasicCalculator c = new BasicCalculator();
        t = new JTextField(16); 
        t.setEditable(false); 
  
     
        JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, divide, multiply, dot, del, eq; 
  
        zero = new JButton("0"); 
        one = new JButton("1"); 
        two = new JButton("2"); 
        three = new JButton("3"); 
        four = new JButton("4"); 
        five = new JButton("5"); 
        six = new JButton("6"); 
        seven = new JButton("7"); 
        eight = new JButton("8"); 
        nine = new JButton("9"); 
        eq = new JButton("="); 
        add = new JButton("+"); 
        sub = new JButton("-"); 
        divide = new JButton("/"); 
        multiply = new JButton("*"); 
        del = new JButton("C"); 
        dot = new JButton("."); 
        JPanel p = new JPanel(); 
  

        multiply.addActionListener(c); 
        divide.addActionListener(c); 
        sub.addActionListener(c); 
        add.addActionListener(c); 
        nine.addActionListener(c); 
        eight.addActionListener(c); 
        seven.addActionListener(c); 
        six.addActionListener(c); 
        five.addActionListener(c); 
        four.addActionListener(c); 
        three.addActionListener(c); 
        two.addActionListener(c); 
        one.addActionListener(c); 
        zero.addActionListener(c); 
        del.addActionListener(c); 
        dot.addActionListener(c); 
        eq.addActionListener(c); 
  
        p.add(t); 
        p.add(add); 
        p.add(one); 
        p.add(two); 
        p.add(three); 
        p.add(sub); 
        p.add(four); 
        p.add(five); 
        p.add(six); 
        p.add(multiply); 
        p.add(seven); 
        p.add(eight); 
        p.add(nine); 
        p.add(divide); 
        p.add(del); 
        p.add(zero); 
        p.add(dot); 
        p.add(eq); 
  
        p.setBackground(Color.GRAY); 

        f.add(p); 
  
        f.setSize(350, 200); 
        f.setVisible(true);
    } 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
  
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
           
            if (!str2.equals("")) 
                str3 = str3 + s; 
            else
                str1 = str1 + s; 
  
            t.setText(str1 + str2 + str3); 
        } 
        else if (s.charAt(0) == 'C') { 

            str1 = str2 = str3 = ""; 

            t.setText(str1 + str2 + str3); 
        } 
        else if (s.charAt(0) == '=') { 
  
            double te; 
            if (str2.equals("+")) 
                te = (Double.parseDouble(str1) + Double.parseDouble(str3)); 
            else if (str2.equals("-")) 
                te = (Double.parseDouble(str1) - Double.parseDouble(str3)); 
            else if (str2.equals("/")) 
                te = (Double.parseDouble(str1) / Double.parseDouble(str3)); 
            else
                te = (Double.parseDouble(str1) * Double.parseDouble(str3)); 
 
            t.setText(str1 + str2 + str3 + "=" + te); 

            str1 = Double.toString(te); 
  
            str2 = str3 = ""; 
        } 
        else { 
            if (str2.equals("") || str3.equals("")) 
                str2 = s; 

            else { 
                double te; 

                if (str2.equals("+")) 
                    te = (Double.parseDouble(str1) + Double.parseDouble(str3)); 
                else if (str2.equals("-")) 
                    te = (Double.parseDouble(str1) - Double.parseDouble(str3)); 
                else if (str2.equals("/")) 
                    te = (Double.parseDouble(str1) / Double.parseDouble(str3)); 
                else
                    te = (Double.parseDouble(str1) * Double.parseDouble(str3)); 
                str1 = Double.toString(te); 
                str2 = s; 
                str3 = ""; 
            } 
            t.setText(str1 + str2 + str3); 
        } 
    } 
} 