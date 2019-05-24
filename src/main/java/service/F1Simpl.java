package service;

import models.F1;
import org.springframework.stereotype.Service;
import repo.F1Repo;

import java.util.List;

@Service
public class F1Simpl implements F1Service {
    F1Repo f1Repo;

    public F1Simpl(F1Repo f1Repo) {
        this.f1Repo = f1Repo;
    }


    public List<F1> findAll() {
        return f1Repo.findAll();
    }

    public void flush() {
        f1Repo.flush();

    }

    public void save(F1 f1) {
        f1Repo.save(f1);
    }

    public void saveAll(Iterable<F1> iterable) {
        f1Repo.saveAll(iterable);
    }
}
