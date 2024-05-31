package com.facebook2.controller;

import java.util.Scanner;

public class FacebookController implements FacebookControllerInterface {

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter city");
		String city=sc.next();
		
		System.out.println("your detail is ");
		System.out.println("name is "+name);
		System.out.println("password is "+password);
		System.out.println("email is "+email);
		System.out.println("city is "+city);

	}

	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

}
