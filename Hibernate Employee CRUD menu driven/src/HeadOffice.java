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
			System.out.println("Enter your choice as per the operation to be perfprmed:\n "
					+ "1. To create record\n"
					+ "2. To update record\n"
					+ "3. To delete record\n"
					+ "4. To view list of Employees ");
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
			case 2: System.out.println("Enter the id to update: ");
					employeeDaoImpl.updateEmployee(sc.nextInt());
			case 3: System.out.println("Enter the id to delete record");	
					employeeDaoImpl.deleteEmployee(sc.nextInt());
			case 4: employeeDaoImpl.getEmployeeList();
			default: System.out.println("default");
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
