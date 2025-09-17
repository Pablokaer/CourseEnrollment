package edu.stuentcourse.courseenrollment.controller;

import edu.stuentcourse.courseenrollment.model.StudentModel;
import edu.stuentcourse.courseenrollment.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
        public List<StudentModel> studentList(){
        return studentService.studentList();
    }

    @PostMapping("/create")
    public StudentModel createStudent(@RequestBody StudentModel student){
        return studentService.createStudent(student);
    }

    @GetMapping("/list/{id}")
    public StudentModel studentListById(@PathVariable Long id){
        return studentService.studentListById(id);
    }


    @GetMapping("/edit/{id}")
    public StudentModel editStudentById(@PathVariable Long id, @RequestBody StudentModel studentEdited){
        return studentService.editStudentById(id, studentEdited);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return "Student deleted!";
    }



}
