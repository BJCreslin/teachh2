package repo;

import models.F3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface F3Repo  extends JpaRepository<F3,Long> {
    List<F3> findAll();

    void flush();

    F3 save(F3 f3);

    <S extends F3> List<S> saveAll(Iterable<S> iterable);
}
