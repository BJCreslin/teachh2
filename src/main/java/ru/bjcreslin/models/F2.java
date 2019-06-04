package ru.bjcreslin.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "F2")
@Data
public class F2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column
    private String name;

    @Column
    private F1 f1;
}
