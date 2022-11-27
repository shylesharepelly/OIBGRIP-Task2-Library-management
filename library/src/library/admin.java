package library;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class admin{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("ADMIN LOGIN");  
		
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
	    login.setBounds(130,90,100,45);
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
	    
	    admin_menu a = new admin_menu();
	    
	    login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String userValue = user.getText();      
		        String passValue = pass.getText();        
		          
		        if (userValue.equals("root") && passValue.equals("root")) {    
		        	a.main(new String[]{});
		            
		        }  
		        else{  
		        	JOptionPane.showMessageDialog(f,"Please enter valid username and password");
		            
		        }  
			}
		});
	}
	
	}

