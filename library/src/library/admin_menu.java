package library;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class admin_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame f=new JFrame("Library");  
		
		JLabel j1 = new JLabel("ADMIN MENU");
		j1.setBounds(70, 20, 300, 30);
		j1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    JButton addbook,deletebook,viewbook,adduser,deleteuser,viewuser;  
	    addbook=new JButton("Add Book");  
	    addbook.setBounds(110,95, 120,40);  
	     
	    deletebook=new JButton("Remove Book");  
	    deletebook.setBounds(110,150, 120,40);    
	    
	    adduser=new JButton("Add User");  
	    adduser.setBounds(110,200, 120,40);  

	    deleteuser=new JButton("Delete User");  
	    deleteuser.setBounds(110,250, 120,40);  
	    

	    viewuser=new JButton("view Users");  
	    viewuser.setBounds(110,300, 120,40); 
	    
	    viewbook=new JButton("view Book");  
	    viewbook.setBounds(110,350, 120,40); 
	    
	    f.setVisible(true);
	    
	    f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(200, 100);
        f.setResizable(false);
        
        
	   
        f.add(j1);
        f.add(viewuser);
	    f.add(addbook); 
	    f.add(viewbook);
	    f.add(deletebook); 
	    f.add(adduser);  
	    f.add(deleteuser); 
	     
	    f.setSize(400,480);
	    f.setLocationRelativeTo(null);
	    
	    book_add a1 = new book_add();
	    book_delete a2 = new book_delete();
	    member_add m1 = new member_add();
	    member_delete m2 = new member_delete();
	    
	    addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.main(new String[]{});
			}
		});
	    deletebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a2.main(new String[]{});
			}
		});
	    adduser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m1.main(new String[]{});
			}
		});
	    
	    deleteuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m2.main(new String[]{});
			}
		});
	    viewusers v1 = new viewusers();
	    viewuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v1.main(new String[]{});
			}
		});
	    view_books v2 = new view_books();
	    viewbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v2.main(new String[]{});
			}
		});

	}

}
