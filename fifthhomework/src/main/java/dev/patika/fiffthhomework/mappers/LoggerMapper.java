package dev.patika.fiffthhomework.mappers;

import dev.patika.fiffthhomework.dto.LoggerDTO;

import dev.patika.fiffthhomework.model.Logger;
import org.mapstruct.Mapper;

@Mapper
public interface LoggerMapper {
    Logger mapFromLoggerDTOtoLogger(LoggerDTO dto);
    Logger mapFromLoggertoLoggerDTO(Logger logger);
}
