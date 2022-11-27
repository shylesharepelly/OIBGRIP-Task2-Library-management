package library;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class member_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Delete User");  
	    JLabel l1,l2;  
	    l1=new JLabel("UserName");  
	    l1.setBounds(30,15, 100,30);  
	    
	    JTextField user = new JTextField(); 
	    user.setBounds(110, 15, 200, 30);
	         
	       
	    JButton delete=new JButton("delete");
	    delete.setBounds(130,90,80,25);
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
	    
	    f.add(user); 
	    f.add(delete); 
	    f.add(l1); 
	     
	    f.setSize(400,280);
	    f.setLocationRelativeTo(null);
	    
	    delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String username = user.getText();      
		       
				
	    try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?jdbcCompliantTruncation=false&user=root&password=");
            
        	Statement stmt = con.createStatement();
        stmt.executeUpdate("USE LIBRARY"); //Use the database with the name "Library"
        stmt.executeUpdate("DELETE FROM users WHERE USERNAME='"+username+"'"); 
        
        
        JOptionPane.showMessageDialog(null,"User deleted");
        con.close();
       
		}catch(Exception e){ System.out.println(e);
		}  
	}
	    });

	}

}
