package com.college;

public class Library {
	String libraryName = "Central Library";
    int totalBooks = 5000;
    int totalStaff = 5;
    String librarianName = "Shreya";
    String timing = "9 AM to 6 PM";
    String location = "College Campus";
    String contactNumber = "9876543210";

    public void displayLibrary() {
        System.out.println("----- Library Details -----");
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Librarian: " + librarianName);
        System.out.println("Timing: " + timing);
        System.out.println("Location: " + location);
        System.out.println("Contact: " + contactNumber);
    }

}
