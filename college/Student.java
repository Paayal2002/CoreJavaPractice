package com.college;

public class Student {
	String studentName = "Payal";
    int rollNumber = 101;
    int age = 23;
    String courseName = "MCA";
    String collegeName = "DYPIMR";
    double percentage = 88.5;
    String city = "Yavatmal";

    public void displayStudent() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + courseName);
        System.out.println("College: " + collegeName);
        System.out.println("Percentage: " + percentage);
        System.out.println("City: " + city);
    }
}

