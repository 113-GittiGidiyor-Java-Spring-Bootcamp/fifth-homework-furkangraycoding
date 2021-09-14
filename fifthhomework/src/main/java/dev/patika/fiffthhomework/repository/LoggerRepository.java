package dev.patika.fiffthhomework.repository;


import dev.patika.fiffthhomework.model.Logger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepository extends CrudRepository<Logger, Integer> {


}
