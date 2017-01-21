package com;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
	private long id;
	@NotNull
	@Size(min=6, max=12)
	private String firstName;
	@NotNull
	@Size(min=6, max=12)
	private String lastName;
	@NotNull
	@Size(min=6, max=12)
	private String username;
	@NotNull
	@Size(min=6, max=12)
	private String password;
	@NotNull
	@Size(min=6, max=12)
	private String email;
	public Spitter() {
		
	}
	public Spitter(String username, String password, String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public Spitter(long id, String username, String password, String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
