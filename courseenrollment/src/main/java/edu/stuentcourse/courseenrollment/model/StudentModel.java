package edu.stuentcourse.courseenrollment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_student")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString (exclude = "course")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (unique = true, nullable = false)
    private String email;

    @Column (unique = true, nullable = false)
    private int irp;

    @ManyToOne
    @JoinColumn (name = "course_id", nullable = false)
    private CourseModel course;

    public StudentModel(Long id, String name, String email, int irp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.irp = irp;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "IRP=" + irp +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
