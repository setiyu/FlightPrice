package PlaneTicket;

import java.util.Scanner;

public class MyTicket {

	public static void main(String[] args) {

		int age;
		double perKm = 0.10;
		int km;
		int flighttype;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		age = scanner.nextInt();
		System.out.print("KM: ");
		km = scanner.nextInt();
		System.out.print("Flight Type => 1 or 2 : ");
		flighttype = scanner.nextInt();

		double total;
		total = km * perKm;

		if (age > 0 && age < 12 && km > 0) {
			if (flighttype == 1) {
				System.out.println("Price = " + (total * 0.5));
			}
			if (flighttype == 2) {
				System.out.println("Price = " + (total * 0.5 * 0.8));
			}

		} else if (age > 12 && age <= 24 && km > 0) {
			if (flighttype == 1) {
				System.out.println("Price = " + (total * 0.9));
			}
			if (flighttype == 2) {
				System.out.println("Price = " + (total * 0.9 * 0.8));
			}
		} else if (age <= 65 && age > 24 && km > 0) {
			if (flighttype == 1) {
				System.out.println("Price = " + (total));
			}
			if (flighttype == 2) {
				System.out.println("Price = " + (total * 0.8));
			}
		} else if (age > 65 && km > 0) {
			if (flighttype == 1) {
				System.out.println("Price = " + (total * 0.7));
			}
			if (flighttype == 2) {
				System.out.println("Price = " + (total * 0.7 * 0.8));
			}
		} else {
			System.out.println("Wrong information!!!!!!!!!!!");

		}

	}
}