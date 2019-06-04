package ru.bjcreslin.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "F3")
@Data
public class F3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column
    private String name;

    @Column
    private F1 f1;

}
