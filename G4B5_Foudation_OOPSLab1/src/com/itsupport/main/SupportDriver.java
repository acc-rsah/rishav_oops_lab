package com.itsupport.main;

import java.util.Scanner;

import com.itsupport.employee.EmployeeInfo;
import com.support.gladmin.GLAdminSupport;

public class SupportDriver {
	public static void main(String[] args) {
		EmployeeInfo newHire = new EmployeeInfo("Rishav", "Sah");
		GLAdminSupport ticket = new GLAdminSupport();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("*********************************************");
		int inp = sc.nextInt();
		sc.close();

		switch (inp) {
		case 1: {
			generateFName(newHire);
			ticket.showCredentials(newHire.getFName(),newHire.getLName(),"tech");
			break;
		}
		case 2: {
			generateFName(newHire);
			ticket.showCredentials(newHire.getFName(),newHire.getLName(),"admin");
			break;
		}
		case 3: {
			generateFName(newHire);
			ticket.showCredentials(newHire.getFName(),newHire.getLName(),"hr");
			break;
		}
		case 4: {
			generateFName(newHire);
			ticket.showCredentials(newHire.getFName(),newHire.getLName(),"legal");
			break;
		}
		default:
			System.out.println("Dear user please choose right option to create credentials");
		}
	}
	
	private static void generateFName(EmployeeInfo newHire) {
        System.out.println("\nDear " + newHire.getFName() + " your generated credentials are as follows:");
    }
}
