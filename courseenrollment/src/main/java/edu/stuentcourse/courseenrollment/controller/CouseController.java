package edu.stuentcourse.courseenrollment.controller;

import edu.stuentcourse.courseenrollment.model.CourseModel;
import edu.stuentcourse.courseenrollment.model.StudentModel;
import edu.stuentcourse.courseenrollment.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CouseController {

    private CourseService courseService;

    public CouseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/list")
    public List<CourseModel> courseList(){
        return courseService.courseList();
    }

    @PostMapping("/create")
    public CourseModel createCourse(@RequestBody CourseModel course){
        return courseService.createCourse(course);
    }

    @GetMapping("/edit/{id}")
    public CourseModel editCourseById(@PathVariable Long id, @RequestBody CourseModel courseEdited){
        return courseService.editCourseById(id, courseEdited);
    }

    @GetMapping("/list/{id}")
    public CourseModel listCourseById(@PathVariable Long id){
        return courseService.listCourseById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return "Course deleted!";
    }

}
