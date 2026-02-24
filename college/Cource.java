package com.college;

public class Cource {
	
	 String courseName = "MCA";
	    int courseDuration = 2;
	    String courseType = "Post Graduation";
	    int totalSubjects = 10;
	    String mainSubject = "Advanced Java";
	    double courseFees = 120000;
	    String mode = "Offline";

	    public void displayCourse() {
	        System.out.println("----- Course Details -----");
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + courseDuration + " Years");
	        System.out.println("Type: " + courseType);
	        System.out.println("Total Subjects: " + totalSubjects);
	        System.out.println("Main Subject: " + mainSubject);
	        System.out.println("Fees: " + courseFees);
	        System.out.println("Mode: " + mode);
	    }

}
