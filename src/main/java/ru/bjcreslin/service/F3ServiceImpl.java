package ru.bjcreslin.service;

import org.springframework.transaction.annotation.Transactional;
import ru.bjcreslin.models.F3;
import org.springframework.stereotype.Service;
import ru.bjcreslin.repo.F3Repo;

import java.util.List;

@Transactional
@Service
public class F3ServiceImpl implements F3Service {
    private F3Repo repo;

    public F3ServiceImpl(F3Repo repo) {
        this.repo = repo;
    }

    public List<F3> findAll() {
        return repo.findAll();
    }

    public void flush() {
        repo.flush();

    }

    public void save(F3 f3) {
        repo.save(f3);
    }

    public void saveAll(Iterable<F3> iterable) {
        repo.saveAll(iterable);
    }
}
