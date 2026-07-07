package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

@Component
public class StudentService {

    @Autowired
    StudentDao dao;

    public void addStudent(Student student) {

        dao.addStudent(student);

    }

}