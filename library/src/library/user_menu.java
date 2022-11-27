package library;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.Font;
import java.awt.event.*;

public class user_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("USER MENU");  
		
		JLabel j1 = new JLabel("Welcome to Library");
		j1.setBounds(70, 20, 300, 30);
		j1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    JButton issue,returnb,view,issuedb;
	    
	    view=new JButton("VIEW BOOKS");  
	    view.setBounds(110,115, 140,40);  
	     
	    issuedb=new JButton("ISSUED BOOK");  
	    issuedb.setBounds(110,180, 140,40);  
	    
	    issue=new JButton("ISSUE BOOK");  
	    issue.setBounds(110,235, 140,40);  
	     
	    returnb=new JButton("RETURN BOOK");  
	    returnb.setBounds(110,290, 140,40);    
	     
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
        
        
	   
        f.add(j1);

	    f.add(view);  
	    f.add(issuedb); 
	    f.add(issue);  
	    f.add(returnb); 
	     
	    f.setSize(400,480);
	    f.setLocationRelativeTo(null);
	    
	    issue_book a1 = new issue_book();
	    return_book u1=new return_book();
	    
	    view_books v1 = new view_books();
	    book_issued u2=new book_issued();
	    
	    view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v1.main(new String[]{});
			}
		});
	    issuedb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				u2.main(new String[]{});
			}
		});
	    
	    issue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.main(new String[]{});
			}
		});
	    returnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				u1.main(new String[]{});
			}
		});

	}

}
