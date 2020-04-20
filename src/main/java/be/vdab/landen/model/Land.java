package be.vdab.landen.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="landen")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String naam;

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
