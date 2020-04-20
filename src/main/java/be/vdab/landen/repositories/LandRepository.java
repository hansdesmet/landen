package be.vdab.landen.repositories;

import be.vdab.landen.model.Land;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LandRepository extends JpaRepository<Land, Long> {
}
