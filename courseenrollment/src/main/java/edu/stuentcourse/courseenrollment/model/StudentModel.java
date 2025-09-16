package edu.stuentcourse.courseenrollment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_Student")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString (exclude = "course")
public class StudentModel {

    @Id
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (unique = true)
    private String email;

    @Column (unique = true)
    private int IRP;

    @ManyToOne
    @JoinColumn (name = "course")
    private CourseModel course;

    public StudentModel(Long id, String name, String email, int IRP) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.IRP = IRP;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "IRP=" + IRP +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
