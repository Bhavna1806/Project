package com.capgemini.test.ui;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		int ch;
		char choice;
		Modules bankModulesObj = new Modules();
		
		Scanner sc=new Scanner(System.in);
		
		do {
				System.out.println("\n 1. CREATE ACCOUNT \n 2. DISPLAY BALANCE \n 3.DEPOSIT \n 4. WITHDRAW \n 5. FUND TRANSFER \n 6.PRINT TRANSACTIONS \n 7. FINISH"); 
		
				System.out.println("Enter your action: ");
				ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:
						bankModulesObj.createAccount();
						break;
						
				case 2:
						bankModulesObj.showBalance();
						break;
						
				case 3:
						bankModulesObj.deposit();
						break;
						
				case 4:
					bankModulesObj.withdraw();
					break;
					
				case 5:
					bankModulesObj.fundTransfer();
					break;
					
				case 6:
					bankModulesObj.printTransactions();
					break;
					
				case 7:
					System.exit(0);
				}
				
				System.out.println("Do you want to add another choice (Y/N) : ");
				choice = sc.next().charAt(0);
				if(choice == 'Y' || choice == 'y')
					
					continue;
				
				else {
						System.out.println("THANK YOU!!!");
						System.exit(0);
				}
				
		} while(ch != 7);
		sc.close();
		
	}
}



















