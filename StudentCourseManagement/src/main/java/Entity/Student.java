package Entity;

import java.util.List;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@jakarta.persistence.Entity
@Table(name = "student")
public class Student {

    @jakarta.persistence.Id

    private int id;

    private String name;

    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public Student() {
    }

    public Student(String name, String email, List<Course> courses) {
        this.name = name;
        this.email = email;
        this.courses = courses;
    }

    // Getters and Setters
}