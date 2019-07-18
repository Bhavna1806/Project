package com.capgemini.fms.ui;

import java.util.Scanner;

import com.capgemini.fms.bean.Feedback;
import com.capgemini.fms.service.IFeedbackService;

public class Client {

	// CREATE INTERFACE WHICH DISPLAY THE MENU AND ACCEPT THE INPUT FROM USER

	// CREATE OBJECT FOR SERVICE AND EXECUTE THE RESPECTIVE METHOD
	static FeedbackService srvObj = new FeedbackService();

	public static void main(String[] args) {

		System.out.println("TEACHER's Feedback Form: ");

		System.out.println("1. Add Feedback");
		System.out.println("2. Show feedback");
		System.out.println("0. Exit");

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		if (input == 0) {
			return;
		}
		if (input == 1) {
			while (input == 1) {
				Feedback feedback = new Feedback();
				System.out.println("Please enter subject:");
				// VALIDATION
				feedback.setTopic(sc.next());
				System.out.println("Please enter the teacher name: ");
				// VALIDATION
				feedback.setTeacherName(sc.next());
				System.out.println("Please enter your feedback:");

				feedback.setFeedbackPoint(sc.nextInt());

				boolean result = srvObj.addFeedback(feedback);
			}
		}

	}
}
