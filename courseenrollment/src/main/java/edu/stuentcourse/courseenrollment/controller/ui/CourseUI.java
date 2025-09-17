package edu.stuentcourse.courseenrollment.controller.ui;

import edu.stuentcourse.courseenrollment.model.CourseModel;
import edu.stuentcourse.courseenrollment.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course/ui")
public class CourseUI {

    private final CourseService courseService;

    public CourseUI(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping("/list")
    public String courseList(Model model) {
        List<CourseModel> courses = courseService.courseList();
        model.addAttribute("courses", courses);
        return "course-list";
    }
}
