package com.ita.training.java.access.conditional;

public class SwitchDemo {

	public static void main(String[] args) {

		String choice = "E";
		switch (choice) {
		case "A":
			System.out.println("Grade A - range from 85-95%");
			break;
		case "B":
			System.out.println("Grade B - range from 75-84%");

			break;
		case "C":
			System.out.println("Grade C - range from 65-74%");

			break;
		case "D":
			System.out.println("Grade D - range from 35-55%");

			break;

		default:
			System.out.println("Please contact admin");
			break;
		}
	}
}
