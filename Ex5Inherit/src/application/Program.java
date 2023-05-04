package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = keyboard.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Product " + i  +" data:");
			System.out.println("Commom, used or imported (c/u/i)?");
			String label = keyboard.next();
			System.out.println("Name: ");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.println("Price: ");
			Double price = keyboard.nextDouble();
			
			if ("C".equals(label.toUpperCase())) {
				products.add(new Product(name, price));
			} else if("U".equals(label.toUpperCase())) {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				keyboard.nextLine();
				Date date = fmt1.parse(keyboard.next());
				products.add(new UsedProduct(name, price, date));
			}else if("I".equals(label.toUpperCase())) {
				System.out.println("Custom fee: ");
				Double customFee = keyboard.nextDouble();
				products.add(new ImportedProduct(name, price, customFee));
			} else {
				throw new Error ("Invalid option");
			}
		}
		
		System.out.println("\nPRICE TAGS");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		
		keyboard.close();
	}

}
