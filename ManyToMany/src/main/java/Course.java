

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<StudentEntity> students;

    public Course() {}

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setCourseName(String i) {
        this.courseName = i;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}