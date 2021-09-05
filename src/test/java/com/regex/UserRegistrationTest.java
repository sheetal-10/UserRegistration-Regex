package com.regex;

import org.junit.Assert;
import org.junit.Test;

/**
 * J-unit Test Case for validating the details given for User Registration
 * @author sheetal
 * @since 2021-09-02
 */
public class UserRegistrationTest {
	Validater validate = new Validater();

	/**
	 * Test Cases for 
	 * validating First Name and Last Name
	 */

	@Test
	public void givenFirstName_lessThanThreeCharacters_shouldReturnFalse() {
		boolean actual = validate.checkName("Na");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_moreThanTwoCharactersWhichAreSmall_shouldReturnFalse() {
		boolean actual = validate.checkName("name");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_moreThanTwoCharactersWhichAreCapital_shouldReturnFalse() {
		boolean actual = validate.checkName("NAME");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_withUppecaseCharacterInMiddle_shouldReturnFalse() {
		boolean actual = validate.checkName("nAme");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_UppecaseCharacterAtStartingAndInMiddle_shouldReturnFalse() {
		boolean actual = validate.checkName("NaMe");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_withSpecialCharacters_shouldReturnFalse() {
		boolean actual = validate.checkName("N@l");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_withNumbers_shouldReturnFalse() {
		boolean actual = validate.checkName("Nan1");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_MinimumThreeCharactersUppercaseAtStartingAndRemainaingSmall_shouldReturnTrue() {
		boolean actual = validate.checkName("Happy");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenFirstName_MorethanThreeCharactersUppercaseAtStartingAndRemainaingSmall_shouldReturnTrue() {
		boolean actual = validate.checkName("Hap");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test Cases for 
	 * validating E-mail
	 */

	@Test
	public void givenEmail_whenConditionApllies_shouldReturnTrue() {
		boolean actual = validate.checkEmail("balu.pinisetty1993@yahoo.co.in");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_whenContainSymbol_shouldReturnTrue() {
		boolean actual = validate.checkEmail("balu+pinisetty1993@yahoo.com");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withoutDomain_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu+pinisetty1993@.com");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withoutComPart_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu+pinisetty1993@gmail");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_havingContinuousDots_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu..pinisetty1993@gmail.com.in");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_TLDcotainsLessthanTwoCharacters_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu.pinisetty1993@gmail.com.c");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withDoubleAtSymbol_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu@pinisetty1993@gmail.com.c");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withDotAtStart_shouldReturnFalse() {
		boolean actual = validate.checkEmail(".balu.pinisetty1993@gmail.com");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withMultipleTLDinEnd_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu.pinisetty1993@gmail.com.au.in");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withOtherthangivenCharacters_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu*pinisetty1993@gmail.com");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenEmail_withspeciaCharacterinTLD_shouldReturnFalse() {
		boolean actual = validate.checkEmail("balu.pinisetty1993@*mail.com");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test Cases for 
	 * validating Mobile Number
	 */

	@Test
	public void givenMobileNumber_whenConditionApplies_shouldReturnTrue() {
		boolean actual = validate.checkMobileNumber("+91-8885404285");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_whenLessThanTenDigit_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+91-8885404");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withSpace_shouldReturnTrue() {
		boolean actual = validate.checkMobileNumber("+91 8885404285");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withOtherCharacter_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+91_8885404285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withoutCountryCode_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("8885404285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_whengreaterthanTenDigits_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+91 08885404285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withSpecialCharacter_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+91 88854@4285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withalphabeticCharacter_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+91 88854O4285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withotherCountryCode_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+82 88854O4285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMobileNumber_withMobiledigitsstartingWithOtherThan789_shouldReturnFalse() {
		boolean actual = validate.checkMobileNumber("+91 68854O4285");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test Cases for validating Password
	 */

	@Test
	public void givenPassword_whenConditionApplies_shouldReturnTrue() {
		boolean actual = validate.checkPassword("Balu@1234");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenPassword_whenLessThanEightCharacter_shouldReturnFalse() {
		boolean actual = validate.checkPassword("Balu@25");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenPassword_withoutUpperCaseCharacter_shouldReturnFalse() {
		boolean actual = validate.checkPassword("balu@1234");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenPassword_withoutNumber_shouldReturnFalse() {
		boolean actual = validate.checkPassword("Balu@Siva");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenPassword_withoutSpecialCharacter_shouldReturnFalse() {
		boolean actual = validate.checkPassword("Balu1234");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}
