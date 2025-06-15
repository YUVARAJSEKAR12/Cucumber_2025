package com.app.stepdefinition;

import org.junit.Assert;

import com.app.pagexe.LoginPageExe;

import io.cucumber.java.en.*;

public class LoginPage extends LoginPageExe {
	
	@Given("Login to Application")
	public void login_to_application() {
	   System.out.println("login page");
	}
	
	@When("Click the login Button")
	public void click_the_login_button() {
	   System.out.println("login to button");
	}
	@Then("Validate the Homepage")
	public void validate_the_homepage() {
	   System.out.println("homepage");
	}
	
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		LoginPageExe.username(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	    System.out.println(pass);
	}

	@When("Enter the user {string}")
	public void enter_the_user(String user) {
	    System.out.println(user);
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String pass) {
		System.out.println(pass);
	}



}
