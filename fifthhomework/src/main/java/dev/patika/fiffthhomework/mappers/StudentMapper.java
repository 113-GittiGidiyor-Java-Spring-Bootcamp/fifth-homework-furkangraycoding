package dev.patika.fiffthhomework.mappers;

import dev.patika.fiffthhomework.dto.StudentDTO;
import dev.patika.fiffthhomework.model.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {

    Student mapFromStudentDTOtoStudent(StudentDTO dto);
    Student mapFromStudenttoStudentDTO(Student student);

}
