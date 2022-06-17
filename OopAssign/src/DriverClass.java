
public class DriverClass {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.totalSal(20000);
		Manager m= new Manager();
		m.totalSal(30000,15000);
		Labour l = new Labour();
		l.totalSal(833,10,40);
	}
}
