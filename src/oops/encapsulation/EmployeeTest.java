package oops.encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getEmpId());
		emp.setEmpId(100);
		System.out.println(emp.getEmpId());
	}

}
