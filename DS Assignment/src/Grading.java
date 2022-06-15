
import java.util.Scanner;

public class Grading {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first sub marks");
	int i=sc.nextInt();
	System.out.println("Enter the second sub marks");
	int j=sc.nextInt();
	System.out.println("Enter the third sub marks");
	int k = sc.nextInt();
	if(i>60&&j>60&&k>60) {
		System.out.println("You scored A Grade");
	}
	else if(i>60&&j>60||j>60&&k>60||k>60&&i>60) {
		System.out.println("You are promoted");
	}
	else {
		System.out.println("you are failed");
	}
}
}
