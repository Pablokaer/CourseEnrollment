package edu.stuentcourse.courseenrollment.controller.ui;

import edu.stuentcourse.courseenrollment.model.StudentModel;
import edu.stuentcourse.courseenrollment.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student/ui")
public class StudentUI {

    private final StudentService studentService;

    public StudentUI(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/list")
    public String studentList(Model model) {
        List<StudentModel> students = studentService.studentList();
        model.addAttribute("students", students);
        return "student-list";
    }
}
