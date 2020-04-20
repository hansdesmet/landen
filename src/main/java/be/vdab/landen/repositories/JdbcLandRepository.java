package be.vdab.landen.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class JdbcLandRepository implements LandRepository{
    private final JdbcTemplate template;

    JdbcLandRepository(JdbcTemplate template) {
        this.template = template;
    }

    private final RowMapper<String> naamMapper =
            (result, rowNum) -> result.getString("naam");



    @Override
    public List<String> findNamen() {
        return template.query("select naam from landen", naamMapper);
    }
}
