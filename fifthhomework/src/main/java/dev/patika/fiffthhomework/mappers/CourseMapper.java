package dev.patika.fiffthhomework.mappers;

import dev.patika.fiffthhomework.dto.CourseDTO;
import dev.patika.fiffthhomework.model.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper {

    Course mapFromCourseDTOtoCourse(CourseDTO dto);
    Course mapFromCoursetoCourseDTO(Course course);

}
