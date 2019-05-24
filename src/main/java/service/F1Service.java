package service;

import models.F1;

import java.util.List;

public interface F1Service {
    List<F1> findAll();

    void flush();

    void save(F1 f1);

    void saveAll(Iterable<F1> iterable);
}
