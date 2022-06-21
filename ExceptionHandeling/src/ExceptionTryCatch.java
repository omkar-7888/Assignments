import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		
		int z=0;
		int num2=0;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		
		try {
			num2= sc.nextInt();
		z=10/num2;
		System.out.println("Result of :"+z);
		}
		
		catch (ArithmeticException ex1) {
			System.out.println("Cannot Devide By Zero:");
		}
		

	}
		
}
