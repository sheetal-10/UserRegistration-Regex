package com.regex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * JUnit Parameterized Test to validate multiple entry for the Email Address
 * @author sheetal
 * @since 2021-09-02
 */
public class UserEmailTest {
	// variables
		String email;
		boolean expectedOutput;

		// Constructor
		public UserEmailTest(String email, boolean expectedOutput) {
			this.email = email;
			this.expectedOutput = expectedOutput;
		}

		@Parameterized.Parameters
		public static Collection emailIdsWithExpectedOutput() {
			return Arrays.asList(new Object[][] {
				{ "abc@yahoo.com", true },
				{ "abc-100@gamil.com", true },
				{ "abc.100@yahoo.com", true },
				{ "abc111@abc.com", true },
				{ "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true },
				{ "abc@1.com", true },
				{ "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true },
				{ "abc", false },
				{ "abc@.com.my", false },
				{ "abc123@gmail.a", false },
				{ "abc123@.com", false },
				{ "abc123@.com.com", false },
				{ ".abc@abc.com", false },
				{ "abc()*@gmail.com", false },
				{ "abc@%*.com", false },
				{ "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false },
				{ "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false },
				{ "abc.@gmail.com.aa.au", false }
			});
		}
		
		@Test
		public void givenEmail_WithExpectedOutput_ShouldReturnActualResult() {
			Validater validate = new Validater();
			boolean actualResult = validate.checkEmail(email);
			Assert.assertEquals(this.expectedOutput, actualResult);
		}

}
