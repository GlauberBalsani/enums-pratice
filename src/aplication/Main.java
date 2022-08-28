package aplication;

import java.util.Locale;
import java.util.Scanner;


import entities.Worker;
import entities.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter departament name");
		String departamentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.print("Name");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, null, null, null)
		
		
	}

}
