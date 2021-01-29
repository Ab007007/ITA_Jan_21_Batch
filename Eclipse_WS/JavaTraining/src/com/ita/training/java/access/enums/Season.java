package com.ita.training.java.access.enums;

public class Season {

	public enum WEEKDAYS {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		WEEKDAYS choice = WEEKDAYS.MONDAY;
		switch (choice) {
		case MONDAY:
				System.out.println("USer selected monday");
				System.out.println("Month is " + Month.JAN);
			break;
		case TUESDAY:
			System.out.println("USer selected tuesday");

			break;
		case WEDNESDAY:
			System.out.println("USer selected wednesday");

			break;
		case THRUSDAY:
			System.out.println("USer selected thurdday");

			break;
		case FRIDAY:
			System.out.println("USer selected friday");

			break;
		case SATURDAY:
			System.out.println("USer selected saturday");

			break;
		case SUNDAY:
			System.out.println("USer selected sunday");

			break;

		default:
			break;
		}
	}
}
