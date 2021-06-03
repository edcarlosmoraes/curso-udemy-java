package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int quantityRegister = sc.nextInt();
		
		for (int i=1; i <= quantityRegister; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");			
			double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int y = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == y).findFirst().orElse(null);
		
//		Integer pos = position(list, y);	
		
		if (emp  == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.salaryIncrease(percent);
//			list.get(pos).salaryIncrease(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee x : list) {
			System.out.println(x.toString());
		}
		
		sc.close();
	}
	
//FUNCAO	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}			
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
