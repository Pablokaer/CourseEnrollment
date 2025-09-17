package edu.stuentcourse.courseenrollment.service;

import edu.stuentcourse.courseenrollment.model.CourseModel;
import edu.stuentcourse.courseenrollment.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseModel> courseList() {
        return courseRepository.findAll();
    }

    public CourseModel createCourse(CourseModel course) {
        return courseRepository.save(course);
    }

    public CourseModel editCourseById(Long id, CourseModel courseEdited) {
        return courseRepository.findById(id)
            .map(course -> {
                course.setName(courseEdited.getName());
                course.setHours(courseEdited.getHours());
                    course.setStudents(courseEdited.getStudents());
                return courseRepository.save(course);

            }).orElseThrow(() -> new RuntimeException("Course not found with id " + id));
    }

    public CourseModel listCourseById(Long id) {
        Optional<CourseModel> courseById = courseRepository.findById(id);
        return courseById.orElse(null);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
