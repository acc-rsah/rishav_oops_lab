package com.itsupport.services;

public interface CredentialService {
	public void generatePassword();
	public void generateEmailAddress(String fName, String lName, String vertical);
	public void showCredentials(String fName, String lName, String vertical);
}
