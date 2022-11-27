package library;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("USER Login");  
	    JLabel l1,l2;  
	    l1=new JLabel("Username");  
	    l1.setBounds(30,15, 100,30);  
	     
	    l2=new JLabel("Password");  
	    l2.setBounds(30,50, 100,30);    
	     
	    JTextField user = new JTextField(); 
	    user.setBounds(110, 15, 200, 30);
	         
	    JPasswordField pass=new JPasswordField(); 
	    pass.setBounds(110, 50, 200, 30);
	       
	    JButton login=new JButton("Login");
	    login.setBounds(130,90,80,25);
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
	    
	    f.add(pass); 
	    f.add(login);
	    f.add(user); 
	    f.add(l1);
	    f.add(l2); 
	     
	    f.setSize(400,480);
	    f.setLocationRelativeTo(null);
	    user_menu u1 = new user_menu();
	    
	    login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String userValue = user.getText();      
		        String passValue = pass.getText();   
		      
		        	
		        	
		            try
		            {
		            	Class.forName("com.mysql.cj.jdbc.Driver");
		                
		                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=");
		                
		            Statement stmt = con.createStatement();
		              stmt.executeUpdate("USE LIBRARY"); 
		              String st = ("SELECT * FROM USERS WHERE USERNAME='"+userValue+"' AND PASSWORD='"+passValue+"'"); 
		              ResultSet rs = stmt.executeQuery(st);
		              if(rs.next()==false) { 
		                  System.out.print("No user");  
		                  JOptionPane.showMessageDialog(null,"Wrong Username/Password!"); 
		 
		              }
		              else
		              {
		            	  u1.main(new String[]{});
		              }
					
					  
					}catch(Exception e){ System.out.println(e);
					}  
					  
					  
		          
		        }
	    });
	}
}
	    
	
	
		      
	


