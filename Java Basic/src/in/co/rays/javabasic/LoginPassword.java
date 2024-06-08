package in.co.rays.javabasic;

public class LoginPassword {
	public static void main(String[] args) {
		String loginId = "abc@gmail.com";
		String password = "pass123";
		
		if(loginId == "" && password == "") // && And Operator
		{
			System.out.println("login Id is Required");
			System.out.println("password is required");
		}
		else if (loginId == "abc@gmail.com" && password == "pass123")
		{
			System.out.println("login sucessfully");
	} else {
		System.out.println("invalid login id and password");
	}
		
	}

}
