package dev.patika.fiffthhomework.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@JsonTypeName("VisitingResearcher")
public class VisitingResearcherDTO extends InstructorDTO {
    @ApiModelProperty(example = "15.50")
    private double hourlySalary;

}
