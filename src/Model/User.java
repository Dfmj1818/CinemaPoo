package Model;

import java.util.ArrayList;

import View.View;

public class User {
	private String mail;
	private String password;
	private ArrayList<String>purchasedTickets;
	private View view;

	public User(String mail,String password) {
		this.mail=mail;
		this.password=password;
		purchasedTickets=new ArrayList<String>();
		view=new View();
        
	}
	public User() {
		purchasedTickets=new ArrayList<String>();
	}

	public void setMail(String mail) {
		this.mail=mail;
	}

	public String getMail() {
		return mail;
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public String getPassword() {
		return password;
	}
	
	
	

}
