package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				sc.nextLine();

				list.add(new ImportedProduct(name, price, customsFee));
				
			} else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.nextLine();
				
				LocalDate date = LocalDate.parse(manufactureDate,formatter);

				list.add(new UsedProduct(name, price, date));
				
			} else if (ch == 'c') {
				list.add(new Product(name, price));
			}
		}
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}

}
