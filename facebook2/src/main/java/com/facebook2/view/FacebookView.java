package com.facebook2.view;

import java.util.Scanner;

import com.facebook2.controller.FacebookController;
import com.facebook2.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
		System.out.println("****************MAIN MENU***********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		int choice=sc.nextInt();
		
		FacebookControllerInterface fi=new FacebookController();
		
		switch(choice) {
		case 1 : fi.createProfileController();
			break;
		case 2 :fi.viewProfileController();
			break;
		case 3 :fi.deleteProfileController();
			break;
			default : System.out.println("wrong choice");
		}

	}

}
