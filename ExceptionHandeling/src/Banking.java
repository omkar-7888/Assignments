import java.util.Scanner;

class CustomException extends Exception{
	
	String errormsg;
	public CustomException (String errormsg) {
		super();
		this.errormsg = errormsg;
	}
	public static void balanceCheck(int a) throws CustomException{
		int balance = 5000;
		int b1;
		if (a>balance) {
			throw new CustomException("InSufficientBalance");
		}
		else {
			System.out.println(" Please Collect Your Amount:"+ a);
			b1=balance-a;
			System.out.println("Balance left:"+b1);
		}
	}
}
public class Banking {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter Amount Here:");
		int a1 = sc1.nextInt();
		try {
			CustomException.balanceCheck(a1);
		}
		catch (CustomException ex1) {
			System.out.println(ex1.errormsg);
		}

	}

}
