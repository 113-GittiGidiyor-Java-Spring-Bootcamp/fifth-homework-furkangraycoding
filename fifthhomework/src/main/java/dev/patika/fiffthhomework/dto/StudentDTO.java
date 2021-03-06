package dev.patika.fiffthhomework.dto;

import dev.patika.fiffthhomework.model.Course;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class StudentDTO{
    @ApiModelProperty(hidden = true )
    private int id;
    @ApiModelProperty(example = "Ogrencı")
    private String name;
    @ApiModelProperty(example = "1980")
    private int birthDate;
    @ApiModelProperty(example = "Ogrenci adres")
    private String address;
    @ApiModelProperty(example = "male")
    private String gender;
    private List<Course> studentCourses = new ArrayList<>();

}
