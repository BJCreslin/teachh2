package ru.bjcreslin.repo;

import ru.bjcreslin.models.F2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface F2Repo extends JpaRepository<F2, Long> {
    List<F2> findAll();

    void flush();

    F2 save(F2 f2);

    <S extends F2> List<S> saveAll(Iterable<S> iterable);
}
