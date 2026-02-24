package com.college;

public class Event {
	 String eventName = "Tech Fest 2026";
	    String eventDate = "10 March 2026";
	    String eventLocation = "College Auditorium";
	    String organizer = "Computer Department";
	    int totalParticipants = 200;
	    String chiefGuest = "IT Company CEO";
	    String eventType = "Technical";

	    public void displayEvent() {
	        System.out.println("----- Event Details -----");
	        System.out.println("Event Name: " + eventName);
	        System.out.println("Date: " + eventDate);
	        System.out.println("Location: " + eventLocation);
	        System.out.println("Organizer: " + organizer);
	        System.out.println("Participants: " + totalParticipants);
	        System.out.println("Chief Guest: " + chiefGuest);
	        System.out.println("Type: " + eventType);
	    }

}
