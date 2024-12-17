package com.Project.Controller;

import com.Project.Entity.Student;
import com.Project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    public StudentService studentService;

    @PostMapping("/")
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return  studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudentList(){
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudentsDetails(@RequestBody Student student){
           Student student1= studentService.updateStudentDetails(student);
           return student1;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentDetails(@PathVariable int id){
        studentService.deleteStudentDetails(id);
    }



}
