

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka;
import com.tka.Entity.Course;
import com.tka.Entity.Student;
import com.tka.service.StudentService;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService service = context.getBean(StudentService.class);

        Course c1 = new Course("Java", 25000);

        Course c2 = new Course("Spring", 18000);

        Student student = new Student(
                "Payal",
                "payal@gmail.com",
                Arrays.asList(c1, c2));

        service.addStudent(student);

    }

}