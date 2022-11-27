package library;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class viewusers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame f=new JFrame(); 
		f.setSize(500, 500);
        f.setLocation(200, 100);   
	    f.setVisible(true); 
	    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
	 
	    try
        {
	    	
	    	String columnNames[]= {"username","password","role"};
 			JTable table = new JTable();
 			f.add(table);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);
            
        	Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=");
            
        Statement stmt = con.createStatement();
          stmt.executeUpdate("USE LIBRARY");
          String st = ("SELECT * FROM USERS "); 
          ResultSet rs = stmt.executeQuery(st); 
          model.addRow(new Object[] {"username","password","role"});
          while (rs.next()) {
              String username = rs.getString(1);
              String password = rs.getString(2);
              String role = rs.getString(3);
              model.addRow(new Object[] {username,password,role});
              table.setModel(model);
 
          }
		  
		}
          catch(Exception e){ System.out.println(e);
		}  
	    
	    
		
		
		
	}

}

