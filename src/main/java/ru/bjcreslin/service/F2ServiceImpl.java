package ru.bjcreslin.service;

import ru.bjcreslin.models.F2;
import org.springframework.stereotype.Service;
import ru.bjcreslin.repo.F2Repo;

import java.util.List;

@Service
public class F2ServiceImpl implements F2Service {
    private F2Repo repo;

    public F2ServiceImpl(F2Repo repo) {
        this.repo = repo;
    }

    public List<F2> findAll() {
        return repo.findAll();
    }

    public void flush() {
        repo.flush();

    }

    public void save(F2 f2) {
        repo.save(f2);
    }

    public void saveAll(Iterable<F2> iterable) {
        repo.saveAll(iterable);
    }
}
