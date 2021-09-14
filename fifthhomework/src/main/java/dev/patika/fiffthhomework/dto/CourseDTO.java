package dev.patika.fiffthhomework.dto;


import dev.patika.fiffthhomework.model.Instructor;
import dev.patika.fiffthhomework.model.Student;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseDTO {
    @ApiModelProperty(hidden = true)
    private int id;

    @ApiModelProperty(example = "Math")
    private String courseName;
    @ApiModelProperty(example = "Math102")
    private String courseCode;
    @ApiModelProperty(example = "5")
    private int credit;
    private Instructor instructor;
    private List<Student> studentList = new ArrayList<>();

}
