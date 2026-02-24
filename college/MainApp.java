package com.college;

public class MainApp {
	
	    public static void main(String[] args) {

	        Student s = new Student();
	        Faculty f = new Faculty();
	        Cource c = new Cource();
	        Library l = new Library();
	        Event e = new Event();

	        s.displayStudent();
	        System.out.println();

	        f.displayFaculty();
	        System.out.println();

	        c.displayCourse();
	        System.out.println();

	        l.displayLibrary();
	        System.out.println();

	        e.displayEvent();
	    }
	}

