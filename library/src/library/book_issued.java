package library;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class book_issued {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Issued Books"); 
		f.setSize(500, 500);
        f.setLocation(200, 100);   
	    f.setVisible(true); 
	    
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    try
        {
	    	
	    	String columnNames[]= {"BookName","Author","Copies"};
 			JTable table = new JTable();
 			f.add(table);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);
            
        	Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=");
            
        Statement stmt = con.createStatement();
          stmt.executeUpdate("USE LIBRARY");
          String st = ("SELECT * FROM BOOk  where issued ='1'"); 
          ResultSet rs = stmt.executeQuery(st); 
          model.addRow(new Object[] {"BookName","Author","Copies"});
          while (rs.next()) {
              String name = rs.getString(1);
              String author = rs.getString(2);
              String copies = rs.getString(3);
           
              model.addRow(new Object[] {name,author,copies});
              table.setModel(model);
 
          }
		  
		}
          catch(Exception e){ System.out.println(e);
		}  
	    
	    
		

	}

}
