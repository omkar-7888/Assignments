import java.util.TreeMap;

public class Details {

	public static void main(String[] args) {
	
		 TreeMap<Long,ContactDetails> treemap = new TreeMap<>();
		 
		 ContactDetails cd = new ContactDetails(7888182880l, "omkar", "omkar@gmail.com");
		 ContactDetails cd1 = new ContactDetails(6745897343l, "amit", "amit12@gmail.com");
		 ContactDetails cd2 = new ContactDetails(8976564323l, "mani", "mani33@gmail.com");
		 
		 treemap.put(1l, cd);
		 treemap.put(2l, cd1);
		 treemap.put(3l, cd2);
		 
		 for(long l:treemap.keySet()) {
			 System.out.println(l+" ");
		 }
		 
		 System.out.println("***************************");
		 System.out.println(treemap.get(1l));
		 System.out.println(treemap.get(2l));
		 System.out.println(treemap.get(3l));
		 
		 System.out.println("*****************");
		 System.out.println(treemap);
	}

}
