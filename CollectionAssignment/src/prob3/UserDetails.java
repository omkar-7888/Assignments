package prob3;

import java.util.Scanner;
import java.util.TreeSet;

public class UserDetails {
public static void main(String[] args) {
	System.out.println("1.Id");
	System.out.println("2.Name");
	System.out.println("3.Department");
	System.out.println("4.Salary");
	Scanner sc=new Scanner(System.in);
	System.out.println("Type Your option");
	String str = sc.nextLine();
	if(str.equals("Id")) {
		TreeSet<EmployeeDetails> ts= new TreeSet<EmployeeDetails>(new SortById());
		ts.add(new EmployeeDetails(4,"mani","Hr",22000));
		ts.add(new EmployeeDetails(9,"omkar", "Accounting", 33000));
		ts.add(new EmployeeDetails(3,"amit","Development",26000));
		ts.add(new EmployeeDetails(1,"smit","Accounting",45000));
		ts.add(new EmployeeDetails(5,"mahendra", "Testing", 54000));
		ts.add(new EmployeeDetails(6,"kunal","Hr",37000));
		ts.add(new EmployeeDetails(7,"shrey", "Development", 44000));
		ts.add(new EmployeeDetails(8,"ketki","Accounting",22000));
		ts.add(new EmployeeDetails(2,"aniket","Testing",31000));
		ts.add(new EmployeeDetails(10,"sanket", "Hr", 39000));
		for(EmployeeDetails e:ts) {
			System.out.println(e);
		}
	}
	else if(str.equals("Name")) {
		TreeSet<EmployeeDetails> ts= new TreeSet<EmployeeDetails>(new SortByName());
		ts.add(new EmployeeDetails(4,"mani","Hr",22000));
		ts.add(new EmployeeDetails(9,"omkar", "Accounting", 33000));
		ts.add(new EmployeeDetails(3,"amit","Development",26000));
		ts.add(new EmployeeDetails(1,"smit","Accounting",45000));
		ts.add(new EmployeeDetails(5,"mahendra", "Testing", 54000));
		ts.add(new EmployeeDetails(6,"kunal","Hr",37000));
		ts.add(new EmployeeDetails(7,"shrey", "Development", 44000));
		ts.add(new EmployeeDetails(8,"ketki","Accounting",22000));
		ts.add(new EmployeeDetails(2,"aniket","Testing",31000));
		ts.add(new EmployeeDetails(10,"sanket", "Hr", 39000));
		for(EmployeeDetails e:ts) {
			System.out.println(e);
		}
	}
	else if(str.equals("Department")) {
		TreeSet<EmployeeDetails> ts= new TreeSet<EmployeeDetails>(new SortByDept());
		ts.add(new EmployeeDetails(4,"mani","Hr",22000));
		ts.add(new EmployeeDetails(9,"omkar", "Accounting", 33000));
		ts.add(new EmployeeDetails(3,"amit","Development",26000));
		ts.add(new EmployeeDetails(1,"smit","Accounting",45000));
		ts.add(new EmployeeDetails(5,"mahendra", "Testing", 54000));
		ts.add(new EmployeeDetails(6,"kunal","Hr",37000));
		ts.add(new EmployeeDetails(7,"shrey", "Development", 44000));
		ts.add(new EmployeeDetails(8,"ketki","Accounting",22000));
		ts.add(new EmployeeDetails(2,"aniket","Testing",31000));
		ts.add(new EmployeeDetails(10,"sanket", "Hr", 39000));
		for(EmployeeDetails e:ts) {
			System.out.println(e);
		}
	}
	else if(str.equals("Salary")) 
	{
		TreeSet<EmployeeDetails> ts= new TreeSet<EmployeeDetails>(new SortBySal());
		ts.add(new EmployeeDetails(4,"mani","Hr",22000));
		ts.add(new EmployeeDetails(9,"omkar", "Accounting", 33000));
		ts.add(new EmployeeDetails(3,"amit","Development",26000));
		ts.add(new EmployeeDetails(1,"smit","Accounting",45000));
		ts.add(new EmployeeDetails(5,"mahendra", "Testing", 54000));
		ts.add(new EmployeeDetails(6,"kunal","Hr",37000));
		ts.add(new EmployeeDetails(7,"shrey", "Development", 44000));
		ts.add(new EmployeeDetails(8,"ketki","Accounting",22000));
		ts.add(new EmployeeDetails(2,"aniket","Testing",31000));
		ts.add(new EmployeeDetails(10,"sanket", "Hr", 39000));
		for(EmployeeDetails e:ts) {
			System.out.println(e);
		}
	}
}
}