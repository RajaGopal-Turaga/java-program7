package aits;
import java.util.*;
public class login {
	public static void main(String[] args)
	{
       //public static void caseInsensitiveLogin(String inputUsername, String storedUsername) {
    	   
	     String inputUsername="raju@13";
	     Scanner sin=new Scanner(System.in);
	     String  storedUsername=sin.nextLine();
		 if(inputUsername.equalsIgnoreCase( storedUsername))
		 {
			System.out.println("login");
		 }
		 else {
			System.out.println("not login");
		 }
       }

	}


