package com.trinity.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotNull(message = "First Name Connot Be Empty")
	@Size(min = 2, message = "First Name Connot Be less than 2 characters")
	private String firstName;
	private String lastName;
	@NotNull(message = "Email Connot Be Empty")
	@Email
	private String email;
	@NotNull(message = "Password cannot be empty")
	@Size(min = 8, max = 16, message = "Password must be equal to or greater than 8 characters and less than 16 ")
	private String password;
	private String userId;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
