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

    @Override
    public String toString() {
        return "F2{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", f1=" + f1.getName() +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "f1_code")
    private F1 f1;
}
