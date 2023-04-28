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
		Locale.setDefault(Locale.US);
		SimpleDateFormat fmt1 = new SimpleDateFormat ("dd/MM/yyyy");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Email: ");
		String email = keyboard.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date date = fmt1.parse(keyboard.nextLine());
		Client client = new Client(name, email, date);
		
		System.out.println("Enter order data ");
		System.out.println("Status: ");
		String status = keyboard.next();
		Order order = new Order(client, new Date(), OrderStatus.valueOf(status));
		System.out.print("How many items to this order?: ");
		int n = keyboard.nextInt();
		for(int i =1; i<= n; i++) {
			System.out.println("Enter #"+ i + " data:");
			System.out.print("Product name: ");
			keyboard.nextLine();
			String productName = keyboard.nextLine();
			System.out.print("Product price: ");
			Double productPrice = keyboard.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = keyboard.nextInt();
			order.addItem(new OrderItem( quantity, productPrice, new Product(productName, productPrice)));
		}
		System.out.println(order.toString());
				
		keyboard.close();

	}

}
