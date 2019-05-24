package service;

import models.F2;
import org.springframework.stereotype.Service;
import repo.F2Repo;

import java.util.List;

@Service
public class F2Simpl implements F2Service {
    F2Repo f2Repo;

    public F2Simpl(F2Repo f2Repo) {
        this.f2Repo = f2Repo;
    }

    public List<F2> findAll() {
        return f2Repo.findAll();
    }

    public void flush() {
        f2Repo.flush();

    }

    public void save(F2 f2) {
        f2Repo.save(f2);
    }

    public void saveAll(Iterable<F2> iterable) {
        f2Repo.saveAll(iterable);
    }
}
