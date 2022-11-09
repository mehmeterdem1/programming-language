package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
