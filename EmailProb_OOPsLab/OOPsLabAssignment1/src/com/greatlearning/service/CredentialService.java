package com.greatlearning.service;

import java.util.Random;
import java.util.Scanner;

import com.greatlearning.model.Employee;

public class CredentialService {
	String email="";
	String password="";
	Scanner sc=new Scanner(System.in);

	public String  generatePassword() {
		
		String capLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smalllLetters="abcdefghijklmnopqrstuvwxyz";
		String splCharacters="!@#$%&<>=+-_/?{}";
		String numbers="0123456789";
		
		String value=capLetters+smalllLetters+splCharacters+numbers;
		
		Random random= new Random();
		 char[] pd= new char[9];
		  
			pd[0]= capLetters.charAt(random.nextInt(capLetters.length()));
			pd[1]= smalllLetters.charAt(random.nextInt(smalllLetters.length()));
			pd[2]= splCharacters.charAt(random.nextInt(splCharacters.length()));
			pd[3]= numbers.charAt(random.nextInt(numbers.length()));
			for(int i=0;i<9;i++){
			pd[i]=value.charAt(random.nextInt(value.length()));
			password=password+pd[i];
		  } 
		  return password;
	}
	public String generateEmail(Employee employee,String dept) {
		String fname=employee.getFirstName();
		String lname=employee.getLastName();
		email=fname+lname+"@"+dept+".xyz.com";
		return email;}
	
	public void showCredentials() {
		
		System.out.println("Email -->"+email);
		System.out.println("Password -->"+password);
	}
	
}
