package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F2")
@Data
public class F2 {
    @Id
    private Long code;

    private String name;

    private F1 f1;
}
