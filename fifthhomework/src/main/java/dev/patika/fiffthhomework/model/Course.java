package dev.patika.fiffthhomework.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course extends AbstractBaseEntity {

    private String courseName;
    private String courseCode;
    private int credit;

    //Many to one
    @ManyToOne
    private Instructor instructor;

    @ManyToMany(mappedBy = "studentCourses")
    private List<Student> studentList = new ArrayList<>();

}
