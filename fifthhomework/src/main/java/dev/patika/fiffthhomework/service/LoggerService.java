package dev.patika.fiffthhomework.service;



import dev.patika.fiffthhomework.dto.LoggerDTO;
import dev.patika.fiffthhomework.mappers.LoggerMapper;

import dev.patika.fiffthhomework.model.Logger;

import dev.patika.fiffthhomework.repository.LoggerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LoggerService {


    private final LoggerRepository loggerRepository;
    private final LoggerMapper loggerMapper;


    @Transactional(readOnly = true)
    public List<Logger> findAll() {
        List<Logger> loglist = new ArrayList<>();
        Iterable<Logger> loggersiter = loggerRepository.findAll();
        loggersiter.iterator().forEachRemaining(loglist::add);
        return loglist;
    }


    @Transactional
    public Logger save(LoggerDTO loggerDTO) {

        Logger logger=loggerMapper.mapFromLoggerDTOtoLogger(loggerDTO);
        return loggerRepository.save(logger);
    }









}
