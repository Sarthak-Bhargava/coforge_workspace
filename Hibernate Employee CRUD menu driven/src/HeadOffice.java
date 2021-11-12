import java.util.Scanner;

import com.org.pojo.Employee;
import com.org.service.EmployeeDaoImpl;

public class HeadOffice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		boolean x = false;
		
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		Employee employee = new Employee();
		
		do {
			System.out.println("Enter your choice as per the operation to be perfprmed: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter employee id: ");
					employee.setId(sc.nextInt());
					System.out.println("Enter first name: ");
					employee.setFirstName(sc.nextLine());
					System.out.println("Enter last name: ");
					employee.setLastName(sc.nextLine());
					System.out.println("Enter designation");
					employee.setDesignation(sc.nextLine());
					System.out.println("Enter salary");
					employee.setSalary(sc.nextInt());
					employeeDaoImpl.addEmployee(employee);
					System.out.println("Record added");
					break;
			default: System.out.println("Invalid Input");
					 break;	
			
			
			}	
		}
		while(x=true);
//		employee.setId(101);
//		employee.setFirstName("Ramu");
//		employee.setLastName("kaka");
//		employee.setDesignation("Washerman");
//		employee.setSalary(18000);
//		
//		employeeDaoImpl.addEmployee(employee);
//		System.out.println("Record added");

	}

}
