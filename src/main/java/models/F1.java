package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "F1")
@Data
public class F1 {
    @Id
    private Long code;

    private String name;

    private Set<F2> f2Set = new HashSet<F2>();

    private Set<F3> f3Set = new HashSet<F3>();

    public void addF2(F2 f2) {
        f2Set.add(f2);
    }

    public void addF3(F3 f3) {
        f3Set.add(f3);
    }

}
