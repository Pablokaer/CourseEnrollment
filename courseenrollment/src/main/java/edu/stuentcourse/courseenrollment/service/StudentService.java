package edu.stuentcourse.courseenrollment.service;

import edu.stuentcourse.courseenrollment.model.StudentModel;
import edu.stuentcourse.courseenrollment.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;



    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentModel> studentList() {
        return studentRepository.findAll();
    }

    public StudentModel editStudentById(Long id, StudentModel studentEdited) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(studentEdited.getName());
                    student.setEmail(studentEdited.getEmail());
                    student.setIrp(studentEdited.getIrp());
                    student.setCourse(studentEdited.getCourse());
                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public StudentModel studentListById(Long id) {
        Optional<StudentModel> studentById = studentRepository.findById(id);
        return studentById.orElse(null);
    }

    public StudentModel createStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }


}
