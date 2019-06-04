package ru.bjcreslin.service;

import ru.bjcreslin.models.F3;

import java.util.List;

public interface F3Service {
    List<F3> findAll();

    void flush();

    void save(F3 f3);

    void saveAll(Iterable<F3> iterable);
}
