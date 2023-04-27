package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter departments`s name:");
		String departmentName = keyboard.nextLine();
		
		System.out.println("Worker data\n");
		System.out.println("Enter worker's name:");
		String workerName = keyboard.nextLine();
		System.out.println("Enter worker's level:");
		String workerLevel = keyboard.nextLine();
		System.out.println("Enter worker's base Salary:");
		Double workerSalary = keyboard.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), 
							workerSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker?");
		int n = keyboard.nextInt();
		for(int i = 0; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.println("DD/MM/YYYY: ");
			Date contractDate = fmt1.parse(keyboard.next());
			System.out.println("Value per hour: ");
			Double valuePerHour = keyboard.nextDouble();
			System.out.println("Duration (hours)");
			int hours = keyboard.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract); //faz o contrato ser associado com o trabalhador
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = keyboard.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+ worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));
		
		
		
		
		
		keyboard.close();
	}

}
