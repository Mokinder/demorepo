package Assignment1;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationform {
	public static boolean isValidUsername(String name)
	{
		String regex = "^[A-Za-z]\\w{5,29}$";

		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		return m.matches();
	}
	

	// Driver Code
	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the user name : ");
		String str =s.next();
		System.out.println(isValidUsername(str));
		System.out.println("Enter the Email :");
		String email=s.next();
		System.out.println(isvalidemail(email));
		System.out.println("Enter the Mobile number :");
		String mobile=s.next();
		System.out.println(isvalidnumber(mobile));
		System.out.println("Enter the password");
		String password = s.next();
		System.out.println(isvalidpassword(password));
	}


	private static boolean isvalidnumber(String mobile) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^\\d{10}$");
	    Matcher m = pattern.matcher(mobile);
	    return m.matches();
	}


	private static boolean isvalidpassword(String password) {
		// TODO Auto-generated method stub
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
		return m.matches();
	}


	private static boolean isvalidemail(String email) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$\"");
		Matcher m = p.matcher(email);
		return m.matches();
	}
}





