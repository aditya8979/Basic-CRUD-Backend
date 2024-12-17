package com.Project.Service;


import com.Project.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    void createStudent(Student student);

    Optional<Student> getStudentById(int id);

    List<Student> getAllStudents();

    Student updateStudentDetails(Student student);

    void deleteStudentDetails(int id);
}
