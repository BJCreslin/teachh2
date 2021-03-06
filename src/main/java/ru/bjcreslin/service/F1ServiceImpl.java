package ru.bjcreslin.service;

import org.springframework.transaction.annotation.Transactional;
import ru.bjcreslin.models.F1;
import org.springframework.stereotype.Service;
import ru.bjcreslin.repo.F1Repo;

import java.util.List;

@Transactional
@Service
public class F1ServiceImpl implements F1Service {
    private F1Repo repo;

    public F1ServiceImpl(F1Repo repo) {
        this.repo = repo;
    }

    public List<F1> findAll() {
        return repo.findAll();
    }

    public void flush() {
        repo.flush();

    }

    public void save(F1 f1) {
        repo.save(f1);
    }

    public void saveAll(Iterable<F1> iterable) {
        repo.saveAll(iterable);
    }

    public void deleteByCode(Long code) {
        repo.deleteByCode(code);
    }
}
