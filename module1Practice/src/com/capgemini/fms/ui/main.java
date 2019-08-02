package com.capgemini.fms.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.fms.bean.feedback;
import com.capgemini.fms.service.serviceClass;

public class main {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int choice, rating;
		String name;
		String subjectName;

		serviceClass service = new serviceClass();
		feedback f = new feedback();
		Map<String, Integer> m = new HashMap<>();

		while (true) {
			System.out.println("******FEEDBACK DETAILS******");
			System.out.println("1. ADD FEEDBACK");
			System.out.println("2. SHOW FEEDBACK");
			System.out.println("3. EXIT");
			System.out.println("****************************");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Teacher Name: ");
				name = sc.next();
				f.setTeacherName(name);
				sc.nextLine();

				System.out.println("Enter the Subject Name: ");
				subjectName = sc.next();
				f.setTopic(subjectName);
				sc.nextLine();

				System.out.println("Enter the Ratings: ");
				rating = sc.nextInt();
				f.setRating(rating);
				sc.nextLine();

				if (subjectName.equals("English") || subjectName.equals("Math")) {
					m = service.addFeedbackDetails(name, rating, subjectName);
					System.out.println("Feedback Added!");
				} else {

					System.out.println("Not Added!");
					break;
				}
			case 2:
				m = service.getFeedbackReport();
				System.out.println(m);
				break;

			case 3:
				System.exit(0);

			}

		}

	}
}

