package ru.bjcreslin.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F2")
@Data
public class F2 {
    @Id
    private Long code;

    @Column
    private String name;

    @Column
    private F1 f1;
}
