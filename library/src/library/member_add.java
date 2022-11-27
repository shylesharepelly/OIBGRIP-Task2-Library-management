package library;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class member_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("ADD USER");  
	    JLabel l1,l2,l3;  
	    l1=new JLabel("Username");  
	    l1.setBounds(30,15, 100,30);  
	    
	    l2=new JLabel("Password");  
	    l2.setBounds(30,50, 100,30);


	    l3=new JLabel("role");  
	    l3.setBounds(30,85, 100,30); 
	     
	     
	    JTextField user = new JTextField(); 
	    user.setBounds(110, 15, 200, 30);
	         
	    JPasswordField pass=new JPasswordField(); 
	    pass.setBounds(110, 50, 200, 30);
	       

	    JTextField roled=new JTextField(); 
	    roled.setBounds(110, 85, 200, 30);
	    
	    JButton login=new JButton("Add User");
	    login.setBounds(130,130,100,35);
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
	    f.add(l3);
	    f.add(roled);
	     
	    f.setSize(400,380);
	    f.setLocationRelativeTo(null);
	    
	    login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String username = user.getText();      
		        String password = pass.getText();
		        String role = roled.getText();
				
	    try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Loaded driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?jdbcCompliantTruncation=false&user=root&password=");
            //System.out.println("Connected to MySQL");
        Statement stmt = con.createStatement();
          stmt.executeUpdate("USE LIBRARY"); //Use the database with the name "Library"
          stmt.executeUpdate("insert into users values('"+username+"','"+password+"','"+role+"')"); 
          
          JOptionPane.showMessageDialog(null,"User Added"); 
          con.close();
		  
		}catch(Exception e){ System.out.println(e);
		}  
	}
	    });
        
}

    
}
