package library;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Library");  
		
		JLabel j1 = new JLabel("Welcome to Library");
		j1.setBounds(70, 20, 300, 30);
		j1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    JButton adminlogin,userlogin;  
	    adminlogin=new JButton("Admin Login");  
	    adminlogin.setBounds(110,115, 120,40);  
	     
	    userlogin=new JButton("User Login");  
	    userlogin.setBounds(110,180, 120,40);    
	     
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
        
        
	   
        f.add(j1);
	    f.add(adminlogin);  
	    f.add(userlogin); 
	     
	    f.setSize(400,480);
	    f.setLocationRelativeTo(null);
	    
	    admin a1 = new admin();
	    user u1=new user();
	    
	    adminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.main(new String[]{});
			}
		});
	    userlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				u1.main(new String[]{});
			}
		});
	    
	}

}
