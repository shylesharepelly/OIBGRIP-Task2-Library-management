package library;
import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class book_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("ADD BOOK");  
	    JLabel l1,l2,l3;  
	    l1=new JLabel("Book Name");  
	    l1.setBounds(30,15, 100,30);  
	     
	    l2=new JLabel("Author");  
	    l2.setBounds(30,50, 100,30);    
	     

	    l3=new JLabel("No. of copies");  
	    l3.setBounds(30,90, 100,30); 
	    
	    JTextField name = new JTextField(); 
	    name.setBounds(110, 15, 200, 30);
	         
	    JTextField author=new JTextField(); 
	    author.setBounds(110, 50, 200, 30);

	    JTextField cop=new JTextField(); 
	    cop.setBounds(110, 90, 200, 30);
	    JButton addbook=new JButton("add");
	    addbook.setBounds(130,140,80,25);
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
	    
	    f.add(name); 
	    f.add(addbook);  
	    f.add(author); 
	    f.add(l1);  
	    f.add(l2); 
	    f.add(cop);
	    f.add(l3);
	    
	    f.setSize(400,380);
	    f.setLocationRelativeTo(null);
	    
	    
	    addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String bookname = name.getText();      
		        String authorname = author.getText();
		        String copies = cop.getText();
				
	    try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Loaded driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?jdbcCompliantTruncation=false&user=root&password=");
            //System.out.println("Connected to MySQL");
        Statement stmt = con.createStatement();
          stmt.executeUpdate("USE LIBRARY"); //Use the database with the name "Library"
          stmt.executeUpdate("insert into book values('"+bookname+"','"+authorname+"','"+copies+"','0')"); 
          
          JOptionPane.showMessageDialog(null,"Book inserted"); 
          con.close();
		
		  
		}catch(Exception e){ System.out.println(e);
		}  
	}
	    });
	}

}
