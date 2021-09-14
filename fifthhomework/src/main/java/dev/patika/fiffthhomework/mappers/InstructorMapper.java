package dev.patika.fiffthhomework.mappers;

import dev.patika.fiffthhomework.dto.InstructorDTO;
import dev.patika.fiffthhomework.model.Instructor;
import org.mapstruct.Mapper;

@Mapper
public interface InstructorMapper {

    Instructor mapFromInstructorDTOtoInstructor(InstructorDTO dto);
    Instructor mapFromInstructortoInstructorDTO(Instructor instructor);

}
