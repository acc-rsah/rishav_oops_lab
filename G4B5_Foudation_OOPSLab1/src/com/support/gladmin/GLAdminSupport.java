package com.support.gladmin;
import java.util.Random;

import com.itsupport.services.CredentialService;

public class GLAdminSupport implements CredentialService {
	
	@Override
	public void generatePassword() {
		String password = generateRandomPassword();
        System.out.println("Password: " + password);
	}

	@Override
	public void generateEmailAddress(String fName, String lName, String vertical) {
		String companyName = "gladmission.com";
		System.out.println("Email: " + fName.toLowerCase()  + lName.toLowerCase() + "@" + vertical + companyName);
		
	}

	@Override
	public void showCredentials(String fName, String lName, String vertical) {
		generateEmailAddress(fName, lName, vertical);
		generatePassword();
	}
	
	private String generateRandomPassword() {
        String numbers = "0123456789";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*()-_+=<>?";

        String allCharacters = numbers + uppercaseLetters + lowercaseLetters + specialCharacters;
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char randomChar = allCharacters.charAt(random.nextInt(allCharacters.length()));
            password.append(randomChar);
        }

        return password.toString();
    }
}
