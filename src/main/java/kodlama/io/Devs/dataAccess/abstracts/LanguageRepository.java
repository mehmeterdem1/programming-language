package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageRepository extends JpaRepository<Language, Long> {

}
