
import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	int count=0;
	if(count<=3) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Username");
	String s=sc.next();
	System.out.println("Enter the Password");
	String s1=sc.next();
	if(s.equals("omkar7888")&&s1.equals("omkar@123")) {
		System.out.println("Successfully Login");
	}
	else {
       System.out.println("Incorect Uusername or Password !!   Try Again  !!");
	}
}
}
}
