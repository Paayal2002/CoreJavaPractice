package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.tka.entity.Student;
import com.tka.util.HibernateUtil;

@Component
public class StudentDao {

    public void addStudent(Student student) {

        Session session = HibernateUtil.getFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);

        tx.commit();

        session.close();

        System.out.println("Student Saved Successfully");
    }
}