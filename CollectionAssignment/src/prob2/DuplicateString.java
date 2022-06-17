package prob2;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateString {

	public static void main(String[] args) {
		TreeSet<String> str = new TreeSet<>();
		str.add("Omkar");
		str.add("Amit");
		str.add("Shreyash");
		str.add("Sanket");
		str.add("Aniket");
		str.add("Mani");
		str.add("Mani");
		str.add("Aftab");
		str.add("Shreyash");
		str.add("Rana");
		str.add("Amit");
		
		System.out.println(str);

	}

}
