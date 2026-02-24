package com.college;

public class Faculty {
	

	    String facultyName = "Pritesh Sir";
	    int facultyId = 5001;
	    String department = "Computer";
	    String subject = "Java";
	    double salary = 60000;
	    String experience = "5 Years";
	    String qualification = "M.Tech";

	    public void displayFaculty() {
	        System.out.println("----- Faculty Details -----");
	        System.out.println("Name: " + facultyName);
	        System.out.println("ID: " + facultyId);
	        System.out.println("Department: " + department);
	        System.out.println("Subject: " + subject);
	        System.out.println("Salary: " + salary);
	        System.out.println("Experience: " + experience);
	        System.out.println("Qualification: " + qualification);
	    }
}
