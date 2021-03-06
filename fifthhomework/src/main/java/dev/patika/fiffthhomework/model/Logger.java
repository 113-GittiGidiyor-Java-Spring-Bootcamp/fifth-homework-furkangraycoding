package dev.patika.fiffthhomework.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Logger extends AbstractBaseEntity {

    private LocalDate throwDate;
    private String throwMessage;

}
