package jpaempproj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	private int id;
	private String name;
	private String password;
	private String mailid;
	private String gender;
	public Employees() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employees(int id, String name, String password, String mailid, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mailid = mailid;
		this.gender = gender;
	}
	
}
