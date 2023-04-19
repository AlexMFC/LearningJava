package main;

import java.util.Scanner;

import entities.Hostel;
import entities.Rent;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		Hostel rooms[] = new Hostel[10];
		
		System.out.println("How many rooms will be rented?");
		n = keyboard.nextInt();
		Student students[] = new Student[n];
		Rent rent[] = new Rent[n];
		
		for(int i=0; i< students.length; i++) {
			System.out.println("\n#RENT# "+ (i+1));
			System.out.println("\nType the student's name:\n");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.println("Type the student's email: \n");
			String email = keyboard.next();
			System.out.println("Type the desired room: \n");
			int x = keyboard.nextInt();
			if (rooms[x] != null) {
				System.out.println("Room already rented, select another one");
			} else {
				rooms[x-1] = new Hostel(x);
				students[i] = new Student (name, email);
				rent[i] = new Rent(rooms[x-1].getRooms(), students[i]);
			}
		}
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < rent.length; i++) {
			if (rooms[i]!= null) {
				System.out.println(rent[i].getRoom() +": " 
									+ rent[i].getStudent().getName() + ", "
									+ rent[i].getStudent().getEmail());
			}
		}
		
		
		
		

	}

}
