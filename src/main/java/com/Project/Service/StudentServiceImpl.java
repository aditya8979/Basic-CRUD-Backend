package com.Project.Service;

import com.Project.Entity.Student;
import com.Project.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    public StudentRepo studentRepo;

    @Override
    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepo.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Transactional
    @Override
    public Student updateStudentDetails(Student student ) {
        Student student1= studentRepo.save(student);
        return student1;
    }

    @Override
    @Transactional
    public void deleteStudentDetails(int id) {
          studentRepo.deleteById(id);
    }
}
