package models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F3")
@Data
public class F3 {
    @Id
    private Long code;

    @Column
    private String name;

    @Column
    private F1 f1;

}
