package practice;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Practice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("How many products?");
		int n = keyboard.nextInt();
		Products[] vet =  new Products[n];
		
		for (int i = 0; i< n; i++) {
			System.out.printf("Product " + (i+1)+ "\n");
			System.out.printf("Value: \n " );
			double value = (double) keyboard.nextDouble();
			System.out.printf("Name: \n" );
			String name = keyboard.next();
			System.out.printf("Quantity: \n");
			int quantity = keyboard.nextInt();
			vet[i] = new Products(value, name, quantity);
			
		}
		
		double sum =0, avg;
		for (int i = 0; i<n; i++) {
			sum += vet[i].getValue();
		}
		
		avg = sum/n;
		System.out.printf("AVERAGE PRICE= %.2f", avg);
	}

}
