package com.capgemini.fms.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.fms.Excep.ApplicationException;
import com.capgemini.fms.bean.Feedback;
import com.capgemini.fms.service.FeedbackService;

public class Client {
	public static void main(String args[]) throws ApplicationException {
		Scanner sc = new Scanner(System.in);

		String name;
		int rating, choice;
		String subjectName;

		Feedback f = new Feedback();
		FeedbackService service = new FeedbackService();
		Map<String, Integer> m = new HashMap<>();

		while (true) {
			System.out.println("******FEEDBACK******");
			System.out.println("1. ADD FEEDBACK");
			System.out.println("2. SHOW FEEDBACK");
			System.out.println("3. EXIT");
			System.out.println("********************");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the teacher name: ");
				name = sc.next();
				f.setTeacherName(name);
				sc.nextLine();

				System.out.println("Enter the rating: ");
				rating = sc.nextInt();
				f.setRating(rating);
				sc.nextLine();

				System.out.println("Enter the subject name: ");
				subjectName = sc.next();
				f.setTopic(subjectName);
				sc.nextLine();

				if ((subjectName.equals("Math")) || (subjectName.equals("English"))) {
					m = service.addFeedbackDetails(name, rating, subjectName);
					System.out.println("Feedback Added!");
				} else
					System.out.println("Feedback not added");
				break;

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
