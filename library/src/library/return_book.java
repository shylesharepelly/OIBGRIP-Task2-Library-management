package library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class return_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		JFrame f=new JFrame("RETURN BOOK");  
	    JLabel l1,l2;  
	    l1=new JLabel("BOOK NAME");  
	    l1.setBounds(30,15, 100,30);  
	        
	     
	    JTextField book = new JTextField(); 
	    book.setBounds(110, 15, 200, 30);
	         
	    JButton returnb=new JButton("return");
	    returnb.setBounds(130,90,80,25);
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
	    
	    f.add(returnb);
	    f.add(book); 
	    f.add(l1);
	    
	     
	    f.setSize(500,400);
	    f.setLocationRelativeTo(null);
	    
	    
	    returnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String bookname = book.getText();      
		        
				
	    try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?jdbcCompliantTruncation=false&user=root&password=");
            
        Statement stmt = con.createStatement();
          stmt.executeUpdate("USE LIBRARY"); //Use the database with the name "Library"
          stmt.executeUpdate("update book set issued='0' where name=('"+bookname+"')"); 
          
          JOptionPane.showMessageDialog(null,"Book Returned"); 
          con.close();
		
		  
		}catch(Exception e){ System.out.println(e);
		}  
	}
	    });
	   
	}

}
