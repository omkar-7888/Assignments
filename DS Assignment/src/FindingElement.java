import java.util.Scanner;

public class FindingElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value to be searched");
	int num1=sc.nextInt();
	int [] numbers= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47,67,83,99,65};
	for(int i=0;i<numbers.length;i++) {
		if(num1==numbers[i]) {
			System.out.println("true");
		}
		
		}
	
	
		System.out.println("Number is Not Present");
	
}
}
