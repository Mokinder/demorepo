package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserregistrationformTest {
	UserRegistrationform ur=new UserRegistrationform();

	@Test
	public void testIsValidUsername() {
		boolean name=ur.isValidUsername("Mokinder");
		assertEquals(true,name);
	}

	@Test
	public void testIsvalidnumber() {
		boolean number=ur.isvalidnumber("9840581160");
		assertEquals(true,number);
	}

	@Test
	public void testIsvalidpassword() {
		boolean pass=ur.isvalidpassword("Mokinder@374");
		assertEquals(true,pass);
	}

	@Test
	public void testIsvalidemail() {
		boolean mail=ur.isvalidemail("abc-100@yahoo.com");
		assertEquals(true,mail);
		mail=ur.isvalidemail("abc-100@abc.net");
		assertEquals(true,mail);
		mail=ur.isvalidemail("abc()*@gmail.com");
		assertEquals(true,mail);
		mail=ur.isvalidemail("abc@%*.com");
		assertEquals(true,mail);
	}

}
