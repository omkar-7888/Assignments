
import java.util.Scanner;

public class Tax {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your ctc");
	int n=sc.nextInt();
	int taxAmt=0;
	if(n>0&&n<180000) {
		System.out.println("Your tax amount -"+taxAmt);
	}
	else if(n>180000&&n<300000) {
		taxAmt=n*10/100;
		System.out.println("Your tax amount -"+taxAmt);
	}
	else if(n>300000&&n<500000) {
		taxAmt=n*20/100;
		System.out.println("Your tax amount -"+taxAmt);
	}
	else if(n>500000&&n<1000000) {
		taxAmt=n*30/100;
		System.out.println("Your tax amount -"+taxAmt);
	}
}
}