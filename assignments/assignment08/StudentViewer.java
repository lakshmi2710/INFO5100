package Assignment8;
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
  

public class StudentViewer {
	    JFrame f;
	    JTable j; 
	    String[][] data = new String[100][4];
	    int dataIndex = 0;

	    StudentViewer() 
	    { 
	        
	    } 
	    
	    public void viewUserData() {
	    	f = new JFrame(); 
	        f.setTitle("Student DATABASE"); 
	        

	        String[] columnNames = { "ID", "Name", "Gender", "Grade" }; 
	  
	        j = new JTable(data, columnNames); 
	        j.setBounds(30, 40, 200, 300); 
	  
	        JScrollPane sp = new JScrollPane(j); 
	        f.add(sp); 
	 
	        f.setSize(500, 200); 
	        f.setVisible(true); 
	    }
	    
	    public void addUserData(String id, String name, String gender, String grade) {
	    	data[dataIndex][0] = id;
	    	data[dataIndex][1] = name;
	    	data[dataIndex][2] = gender;
	    	data[dataIndex][3] = grade;
	    	dataIndex++;
	    }
	    
	    public static void main(String[] args) 
	    { 
	        new StudentViewer(); 
	    } 
} 

