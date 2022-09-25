package Assignment1;

import java.util.Scanner;

import java.util.regex.*;


public class UserRegistrationform {
	public static boolean isValidUsername(String name) throws Checkexception  {
		String regex = "^[A-Za-z]\\w{5,29}$";

		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		if(m.matches() == false)
		{
			throw new Checkexception("username invalid..");
		}
		return m.matches();
	}

	public static boolean isvalidnumber(String mobile) throws Checkexception {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher m = pattern.matcher(mobile);
		if(m.matches() == false)
		{
			throw new Checkexception("number is invalid..");
		}
		return m.matches();
	}

	public static boolean isvalidpassword(String password) throws Checkexception {
		// TODO Auto-generated method stub
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		if(m.matches() == false)
		{
			throw new Checkexception("password is invalid..");
		}
		return m.matches();
	}

	public static boolean isvalidemail(String email) throws Checkexception {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		Matcher m = p.matcher(email);
		if(m.matches() == false)
		{
			throw new Checkexception("email is invalid..");
		}
		return m.matches();
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the user name : ");
		String str = s.next();
		try {
			System.out.println(isValidUsername(str));
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the Email :");
		String email = s.next();
		try {
			System.out.println(isvalidemail(email));
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the Mobile number :");
		String mobile = s.next();
		try {
			System.out.println(isvalidnumber(mobile));
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the password");
		String password = s.next();
		try {
			System.out.println(isvalidpassword(password));
		} catch (Checkexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
