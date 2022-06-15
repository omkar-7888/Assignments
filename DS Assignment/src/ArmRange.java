import java.util.Scanner;
public class ArmRange {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner (System.in);
		System.out.println( "enter Number here");
		int num1=sc.nextInt();

		System.out.println( "enter Number here");
		int num2=sc.nextInt();
	
		for (int i=num1;i<=num2 ;i++ )
		{
			int ans=sum(i);

			if (ans==i)
			{
				System.out.println(ans);
			}
			
		}
	}
	
	public static int sum(int num1)
	{
		int sum=0;
		int count=count(num1);
		for (int i=num1;i>0;i=i/10 )
		{
			int rem=i%10;
			sum=sum+pow(rem,count);
		}
		return sum;
	}
	public static int count(int b)
	{
		int count=0;
		while (b>0)
		{
			b=b/10;
			count++;
		}
		return count;
	}
	public static int pow(int base,int raise)
	{
		int pow=1;
		while (raise>0)
		{
			pow=pow*base;
			raise--;
		}
		return pow;

	}

}
