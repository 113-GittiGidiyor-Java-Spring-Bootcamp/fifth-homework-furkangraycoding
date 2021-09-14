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
@JsonTypeName("PermanentInstructor")
public class PermanentInstructor extends Instructor {

    private double fixedSalary;


}
