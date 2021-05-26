import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: Joao Silva, $ %.2f\n", employee.netSalary());
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f\n", employee.name, employee.grossSalary);

	}

}
