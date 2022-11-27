package library;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class book_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame("Delete Book");  
	    JLabel l1,l2;  
	    l1=new JLabel("Book Name");  
	    l1.setBounds(30,15, 100,30);  
	    
	    JTextField book = new JTextField(); 
	    book.setBounds(110, 15, 200, 30);
	         
	       
	    JButton delete=new JButton("delete");
	    delete.setBounds(130,90,80,25);
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
	    
	    f.add(book);  
	    f.add(delete); 
	    f.add(l1);  
	     
	    f.setSize(400,180);
	    f.setLocationRelativeTo(null);
	    
	    delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String bookname = book.getText();      
		       
				
	    try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?jdbcCompliantTruncation=false&user=root&password=");
            
        	Statement stmt = con.createStatement();
        stmt.executeUpdate("USE LIBRARY"); 
        stmt.executeUpdate("DELETE FROM BOOK WHERE NAME='"+bookname+"'"); 
        
        
        JOptionPane.showMessageDialog(null,"Book deleted");
        
        con.close();
       
		}catch(Exception e){ System.out.println(e);
		}  
	}
	    });
	    
	    
	}

}
