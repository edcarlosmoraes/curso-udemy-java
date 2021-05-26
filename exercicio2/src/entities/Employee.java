package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		this.grossSalary -= tax;
		return grossSalary;
	}
	public void increaseSalary(double percentage) {
		this.grossSalary += (grossSalary + tax)* (percentage/100);
	}
}
