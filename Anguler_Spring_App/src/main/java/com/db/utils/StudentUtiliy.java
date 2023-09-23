package com.db.utils;

public class StudentUtiliy {

	public static final String DATA_UPDATE_IS_SUCCEFULLY = "Data Update is Succefully";

	public static final String DATA_UPDATION_IS_FAILED = "data updation is failed";

	public static final String USER_ID_NOT_FOUND = "User Id not Found";

	public static final String SUCCEFULLY = "Succefully";

	public static final String USER_NOT_FOUND = "User Not Found";

	public static final String USER_ALREADY_EXISTS = "User Already Exists";

	public static final String PASSWORD_INCRRECT = "Password Incorrect";
	
	public static final String PASSWORD_NOT_MATCH="Password Not Match";

	public static final String encryption(String password) {
		
		return null;
	}

	public static final String decryption(String password) {
		return null;
	}

	public static final boolean validatePassword(String password, String confirmPassword) {
		if (password.equals(confirmPassword)) {
			return true;
		}
		return false;
	}
}
