package edu.stuentcourse.courseenrollment.repository;

import edu.stuentcourse.courseenrollment.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, Long> {
}
