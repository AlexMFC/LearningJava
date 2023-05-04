package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Person> persons = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers");
		int n = keyboard.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.println("Individual or Company (I/C)?");
			String type = keyboard.next();
			System.out.println("Name");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.println("Annual income: ");
			Double annualIncome = keyboard.nextDouble();
			if ("C".equals(type.toUpperCase())) {
				System.out.println("Number of employees: ");
				Integer numberOfEmployees = keyboard.nextInt();
				persons.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			} else if ("I".equals(type.toUpperCase())) {
				System.out.println("Health expenditures: ");
				Double healthExpenses = keyboard.nextDouble();
				persons.add(new NaturalPerson(name, annualIncome, healthExpenses));
			}
		}
		
		Double totalTaxes = 0.0;
		System.out.println("\n TAXES PAID");
		for (Person p : persons) {
			System.out.println(p.toString());
			totalTaxes += p.taxes();
		}
		System.out.println("TOTAL TAXES: $" + totalTaxes);
		
		
		keyboard.close();
	}

}
