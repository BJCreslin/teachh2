package service;

import models.F2;

import java.util.List;

public interface F2Service {
    List<F2> findAll();

    void flush();

    void save(F2 f2);

    void saveAll(Iterable<F2> iterable);
}
