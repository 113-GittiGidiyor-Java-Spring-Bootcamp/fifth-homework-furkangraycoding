package dev.patika.fiffthhomework.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonTypeName("VisitingResearcher")
public class VisitingResearcher extends Instructor {
    private double hourlySalary;

}
