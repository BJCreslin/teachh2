package ru.bjcreslin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "F1")
@Data
public class F1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column
    private String name;

    @Column
    private Set<F2> f2Set = new HashSet<F2>();

    @Column
    private Set<F3> f3Set = new HashSet<F3>();

    public void addF2(F2 f2) {
        f2Set.add(f2);
    }

    public void addF3(F3 f3) {
        f3Set.add(f3);
    }

}
