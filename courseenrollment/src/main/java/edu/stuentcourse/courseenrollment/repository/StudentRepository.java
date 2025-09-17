package edu.stuentcourse.courseenrollment.repository;

import edu.stuentcourse.courseenrollment.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
