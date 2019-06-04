package ru.bjcreslin.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "f1")
public class F1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column
    private String name;

//    @OneToOne
//    private F2 f2;

    @OneToMany(mappedBy = "f1", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<F2> f2Set = new HashSet<F2>();
//
//    @Column
//    private Set<F3> f3Set = new HashSet<F3>();
//
    public void addF2(F2 f2) {
        f2Set.add(f2);
    }
//
//    public void addF3(F3 f3) {
//        f3Set.add(f3);

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<F2> getF2Set() {
        return f2Set;
    }

    public void setF2Set(Set<F2> f2Set) {
        this.f2Set = f2Set;
    }

    @Override
    public String toString() {
        return "F1{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", f2Set=" + f2Set.size() +
                '}';
    }
//    }

}
