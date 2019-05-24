package repo;

import models.F1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface F1Repo extends JpaRepository<F1, Long> {
    List<F1> findAll();

    void flush();

    F1 save(F1 f1);

    <S extends F1> List<S> saveAll(Iterable<S> iterable);
}
