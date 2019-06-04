package service;

import models.F3;
import org.springframework.stereotype.Service;
import repo.F3Repo;

import java.util.List;

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