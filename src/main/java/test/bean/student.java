package test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="student")                                   //for table name change

public class student {
	
	@Id                                  				 //for primary key (Id) is compulsory
	@GeneratedValue(strategy=GenerationType.AUTO)        // for auto increment
	private int id;
	
	// @Column(name="first_name")                        // column name change
	@Column                                               // optional
	private String fname;
	
	@Column
	private String lname;

	@Column
	private String email;
	
	@Column
	private String password;
	
	// getter setter method for click on any private int or string and then source and generate getter setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
