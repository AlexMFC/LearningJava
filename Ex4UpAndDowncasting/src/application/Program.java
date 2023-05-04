package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees");
		int n = keyboard.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced? (Y/N): ");
			String verify = keyboard.next();
			keyboard.nextLine();
			System.out.println("Name: ");
			String name = keyboard.nextLine();
			System.out.println("Hours: ");
			Integer hours = keyboard.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = keyboard.nextDouble();
			
			if ("Y".equals(verify.toUpperCase())) {
				System.out.println("Additional charge: ");
				Double additionalCharge = keyboard.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else if ("N".equals(verify.toUpperCase())) {
				employees.add(new Employee (name, hours, valuePerHour));
			} else
				throw new Error("Invalid option");
		}
		
		System.out.println("\nPAYMENTS: ");
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
		
		keyboard.close();
		

	}

}
