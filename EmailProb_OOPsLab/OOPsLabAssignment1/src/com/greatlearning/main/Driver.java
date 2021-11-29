package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Gaurav","Mishra");
		CredentialService credserv=new CredentialService();
		
		System.out.println("Please enter the depatment from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner scan = new Scanner(System.in);
		int option;
		option=scan.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Dear Gaurav Mishra your generated crentials are as follows-");
			credserv.generateEmail(employee,"technical");
			credserv.generatePassword();
			credserv.showCredentials();
			break;
		case 2:
			System.out.println("Dear Gaurav Mishra your generated crentials are as follows-");
			credserv.generateEmail(employee,"admin");
			credserv.generatePassword();
			credserv.showCredentials();
			break;
		case 3:
			System.out.println("Dear Gaurav Mishra your generated crentials are as follows-");
			credserv.generateEmail(employee,"HR");
			credserv.generatePassword();
			credserv.showCredentials();
			break;
		case 4:System.out.println("Dear Gaurav Mishra your generated crentials are as follows-");
		credserv.generateEmail(employee,"legal");
		credserv.generatePassword();
		credserv.showCredentials();
			break;
		default:
			System.out.println("You have made an invalid choice");
			}
		
		
        scan.close();
	}

}
