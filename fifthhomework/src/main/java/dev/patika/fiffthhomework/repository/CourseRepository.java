package dev.patika.fiffthhomework.repository;

import dev.patika.fiffthhomework.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
        List<Course> deleteByCourseName(String name);
        List<Course> findAllByCourseName(String name);
        @Query("SELECT " +
                "  CASE " +
                "   WHEN " +
                "       COUNT(c)>0 " +
                "   THEN " +
                "       TRUE " +
                "   ELSE " +
                "       FALSE " +
                "   END " +
                "FROM Course c " +
                "WHERE c.courseCode = ?1")
        boolean selectExistCourse(String courseCode);




}
