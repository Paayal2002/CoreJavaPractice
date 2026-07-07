package Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String courseName;

    private double fees;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course() {
    }

    public Course(String courseName, double fees) {
        this.courseName = courseName;
        this.fees = fees;
    }

    // Getter Setter
}