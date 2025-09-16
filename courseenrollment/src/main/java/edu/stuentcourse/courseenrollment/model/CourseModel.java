package edu.stuentcourse.courseenrollment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_course")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "hours")
    private int hours;

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<StudentModel> students;

    @Override
    public String toString() {
        return "CourseModel{" +
                "hours=" + hours +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
