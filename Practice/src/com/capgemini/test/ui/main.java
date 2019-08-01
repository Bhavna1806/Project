package com.capgemini.test.ui;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.test.bean.Feedback;
import com.capgemini.test.service.serviceClass;

public class main {

	static serviceClass srvObj = new serviceClass();

	public static void main(String args[]) throws Exception {
		System.out.println("******FEEDBACK FORM******");
		System.out.println("1. ADD FEEDBACK");
		System.out.println("2. SHOW FEEDBACK");
		System.out.println("3. EXIT");
		System.out.println("*************************");

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		if (choice == 0) {
			return;
		}
		if (choice == 1) {
			while (choice == 1) {
				Feedback feedback = new Feedback();
				System.out.println("Please enter the subject: ");
				feedback.setSubject(sc.next());

				System.out.println("Please enter the teacher name: ");
				feedback.setTeacherName(sc.next());

				System.out.println("Please enter the feedback point: ");
				feedback.setFeedbackPoint(sc.nextInt());

				boolean result = srvObj.addFeedBack(feedback);

				if (result) {
					System.out.println("Feedback saved successfully");
				} else {
					System.out.println("Unable to save feedback");
				}

				System.out.println("do u want to add more feedbacks?");

				String currentchoice = sc.next();

				if (currentchoice.equals("Y")) {
					choice = 1;
				} else {
					return;
				}

				if (choice == 2) {
					System.out.println("****FEEDBACK****");
					ArrayList<String> feedbackList = srvObj.showFeedBack();
					for (String str : feedbackList) {
						System.out.println(str);
					}
				}
			}
		}
	}

}
