package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserregistrationformTest {
	UserRegistrationform ur=new UserRegistrationform();

	@Test
	public void testIsValidUsername() {
		boolean name = false;
		try {
			name = ur.isValidUsername("Mokinder");
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,name);
	}

	@Test
	public void testIsvalidnumber() {
		boolean number = false;
		try {
			number = ur.isvalidnumber("9840581160");
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,number);
	}

	@Test
	public void testIsvalidpassword() {
		boolean pass = false;
		try {
			pass = ur.isvalidpassword("Mokinder@374");
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,pass);
	}

	@Test
	public void testIsvalidemail() {
		boolean mail = false;
		try {
			mail = ur.isvalidemail("abc-100@yahoo.com");
			mail=ur.isvalidemail("abc-100@abc.net");
			mail=ur.isvalidemail("abc()*@gmail.com");
			mail=ur.isvalidemail("abc@%*.com");
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,mail);
		
	}

}
