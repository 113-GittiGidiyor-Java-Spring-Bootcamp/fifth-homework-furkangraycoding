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
public class Student extends AbstractBaseEntity{

    private String name;
    private int birthDate;
    private String address;
    private String gender;

    @ManyToMany
    private List<Course> studentCourses = new ArrayList<>();

}
