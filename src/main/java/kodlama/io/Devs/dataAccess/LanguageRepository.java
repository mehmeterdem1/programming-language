package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entity.Language;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface LanguageRepository extends JpaRepository<Language, Long> {

}
