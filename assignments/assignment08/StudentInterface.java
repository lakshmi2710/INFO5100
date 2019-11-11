package Assignment8;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 

class StudentInterface extends JFrame implements ActionListener { 
    static JFrame f; 
    static JTextField ID, Name, Gender, Grade; 
    static JLabel IDlabel, Namelabel, Genderlabel, Gradelabel;
    static StudentViewer StudentRegViewer;
  
    String str1="";
    String str2="";
    String str3="";
    String str4="";
    
    StudentInterface(){}
 
    public static void main(String args[]) 
    { 
    	StudentRegViewer = new StudentViewer();
        f = new JFrame("StudentInterface"); 
        StudentInterface c = new StudentInterface();
        ID = new JTextField(16);
        Name = new JTextField(15); 
        Gender = new JTextField(5); 
        Grade = new JTextField(3); 
        
        IDlabel =  new JLabel("ID");
        Namelabel =  new JLabel("Name");
        Genderlabel =  new JLabel("Gender");
        Gradelabel =  new JLabel("Grade");
        
 
        JButton submit, view; 
  
        submit = new JButton("submit"); 
        view = new JButton("view"); 
        
        JPanel p = new JPanel(); 
  

        submit.addActionListener(c); 
        view.addActionListener(c); 
        
        p.add(ID); 
        p.add(IDlabel);
        
        p.add(Name);
        p.add(Namelabel);
       
        p.add(Gender); 
        p.add(Genderlabel);
        
        p.add(Grade); 
        p.add(Gradelabel);
        
        
        p.add(submit); 
        p.add(view); 
        
  
        p.setBackground(Color.white); 

        f.add(p); 
  
        f.setSize(300, 200); 
        f.setVisible(true); 
    } 
    
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        System.out.println(s);
        if(s == "submit") {
        	System.out.println("submitting student record");
        	StudentRegViewer.addUserData(ID.getText(), Name.getText(), Gender.getText(), Grade.getText());
        }
        else if (s == "view") {
        	System.out.println("viewing student record"); 
        	StudentRegViewer.viewUserData();
        }
  
    } 
} 