package com.regex;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * JUnit Parameterized Test to validate multiple entry for the Email Address
 * @author sheetal
 * @since 2021-08-29
 */

@RunWith(Parameterized.class)
public class UserEmailTest {
	// variables
		Details email;
		boolean expectedOutput;

		// Constructor
		public UserEmailTest(Details email, boolean expectedOutput) {
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
			boolean actualResult = validate.CheckEmail(email);
			Assert.assertEquals(this.expectedOutput, actualResult);
		}

}
