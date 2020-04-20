package be.vdab.landen.services;

import be.vdab.landen.model.Land;
import be.vdab.landen.repositories.LandRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
class DefaultLandService implements LandService {
    private final LandRepository repository;

    DefaultLandService(LandRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Land> findAll() {
        return repository.findAll();
    }
}
