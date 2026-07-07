

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class InsertData {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        cfg.addAnnotatedClass(StudentEntity.class);
        cfg.addAnnotatedClass(Course.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        // Create Courses
        Course c1 = new Course();
        c1.setCourseName(101);
        c1.setCourseName("Java");

        Course c2 = new Course();
        c2.setCourseName(102);
        c2.setCourseName("Hibernate");
        

        // Create Student 1
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Payal");
        s1.setCourses(Arrays.asList(c1, c2));

        // Create Student 2
        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Aniket");
        s2.setCourses(Arrays.asList(c1));

        // Save Data
        ss.persist(s1);
        ss.persist(s2);

        tr.commit();

        System.out.println("Inserted Successfully...!");

        ss.close();
        sf.close();
    }
}