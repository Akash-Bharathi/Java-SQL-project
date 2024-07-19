package com.frontend;

import java.util.Scanner;
import com.backend.Account;

public class Login {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Username : ");
		String username = scanner.nextLine();
		
		System.out.print("Password : ");
		String password = scanner.nextLine();
		
		Account account = new Account();
		boolean result = account.login(username, password);
		if(result)
		{
			System.out.println("Welcome");
			System.out.println("while loop for menus code");
		}
		else
		{
			System.out.println("Invalid Login Credentials!!");
		}		
		scanner.close();
	}
}
