package com.example.irs.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.irs.exception.MyGoBootException;
import com.example.irs.exception.InvalidCityException;
import com.example.irs.exception.InvalidEmailException;
import com.example.irs.exception.InvalidNameException;
import com.example.irs.exception.InvalidPasswordException;
import com.example.irs.exception.InvalidPhoneException;
import com.example.irs.exception.InvalidUserIdException;
import com.example.irs.model.User;
import com.example.irs.repository.UserRepository;

@Service
public class RegistrationServiceBkup {
	
	@Autowired
	private UserRepository userRepository;
	String regex1 = "^[a-zA-Z0-9]{4,15}+$";
	
	public String registerUser(User user) throws MyGoBootException {
		
		String registrationMessage = null;
		validateUser(user);
		registrationMessage = userRepository.registerUser();
		return registrationMessage;
		
	}

	private void validateUser(User user) throws MyGoBootException {
		
		if(!isValidUserId(user.getUserId())) throw new
		InvalidUserIdException("RegistrationService.INVALID_USER_ID");
		if(!isValidName(user.getName())) throw new
		InvalidNameException("RegistrationService.INVALID_NAME");
		if(!isValidPassword(user.getPassword())) throw new
		InvalidPasswordException("RegistrationService.INVALID_PASSWORD");
		if(!isValidCity(user.getCity())) throw new
		InvalidCityException("RegistrationService.INVALID_CITY");
		if(!isValidPhone(user.getPhone())) throw new
		InvalidPhoneException("RegistrationService.INVALID_PHONE_NUMBER");
		if(!isValidEmail(user.getEmail())) throw new
		InvalidEmailException("RegistrationService.INVALID_EMAIL");		
}

	private boolean isValidEmail(String email) {
		Boolean b1 = false;
		String regex5 = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern5 = Pattern.compile(regex5);
		Matcher matcher5 = pattern5.matcher(email);
		if (matcher5.matches())
			b1 = true;
		return b1;
	}

	private boolean isValidPhone(String phone) {
		Boolean b1 = false;
		String regex6 = "[0-9]{10}";
		Pattern pattern6 = Pattern.compile(regex6);
		Matcher matcher6 = pattern6.matcher(phone);
		if (matcher6.matches())
			b1 = true;
		return b1;
	}

	private boolean isValidCity(String city) {
		Boolean b1 = false;
		Pattern pattern4 = Pattern.compile(regex1);
		Matcher matcher4 = pattern4.matcher(city);
		if (matcher4.matches())
			b1 = true;
		return b1;
	}

	private boolean isValidPassword(String password) {
		boolean validpassword = false;
		String regex2 = "^[a-zA-Z0-9]{8,15}+$";
		Pattern passwordpattern = Pattern.compile(regex2);
		Matcher passwordmatch = passwordpattern.matcher(password);
		if (passwordmatch.matches())
			validpassword = true;
		return validpassword;
	}

	private boolean isValidName(String name) {
		Boolean b1 = false;
		Pattern pattern3 = Pattern.compile(regex1);
		Matcher matcher3 = pattern3.matcher(name);
		if (matcher3.matches())
			b1 = true;
		return b1;
	}

	private boolean isValidUserId(String userId) {
		boolean usermatchtrue = false;
		Pattern userpattern = Pattern.compile(regex1);
		Matcher usermatch = userpattern.matcher(userId);
		if (usermatch.matches())
			usermatchtrue = true;
		return usermatchtrue;
	}

}
