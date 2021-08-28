package com.revature.project03.service;

import java.util.Arrays;
import java.util.List;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class GeneratePasswordService {
	public String generateRandomPassword() {

		List rules = Arrays.asList(new CharacterRule(EnglishCharacterData.UpperCase, 1),
				new CharacterRule(EnglishCharacterData.LowerCase, 1), new CharacterRule(EnglishCharacterData.Digit, 1),new CharacterRule(EnglishCharacterData.Special, 1));

		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generatePassword(8, rules);
		return password;
	}

}
