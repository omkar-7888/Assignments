package abstractclass;


public abstract class test2 {

public void printSomething()
	    {
	        System.out.println("Hello From  abstract class");
	    }
}
	
	 class NewClass {
	  
	    public static void main(String[] args)
	    {
	       
	        test2 obj = new test2();//WE CAN NOT INSTANTIATE ABSTRACT CLASS
	    }
	}

