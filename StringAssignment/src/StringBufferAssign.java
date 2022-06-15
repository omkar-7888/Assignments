
public class StringBufferAssign {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("String Buffer");
		
			System.out.println("Original String :"+str);
			str.append("is a peer class of string");
			
			System.out.println("using Append method"+str);
			
			str.append("that provides much of");
			
			System.out.println(str);
			
			str.append(" the functionality of string");
			System.out.println(str);
	}

}
