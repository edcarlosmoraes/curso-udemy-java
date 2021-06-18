package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Client c1 = new Client();
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		c1.setName(sc.nextLine());
		System.out.print("Email: ");
		c1.setEmail(sc.nextLine());
		System.out.print("Birth date (DD/MM/YYYY) ");
		c1.setBirthDate(sdf.parse(sc.nextLine()));
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		Integer n = sc.nextInt();
		
		Order o1 = new Order(new Date(), OrderStatus.valueOf(status), c1);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Product price: ");
			double p = sc.nextDouble();
			System.out.print("Quantity: ");
			int q = sc.nextInt();
			OrderItem orderItem = new OrderItem(q, p, new Product(name, p));
			o1.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(o1.toString());
		
		sc.close();
	}

}
