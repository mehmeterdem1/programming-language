package kodlama.io.Devs.business;

import kodlama.io.Devs.entity.LanguageEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LanguageService {

    List<LanguageEntity> getAll();

    LanguageEntity getById(Long id);

    void save(LanguageEntity language);

    void delete(LanguageEntity language, Long id);

    LanguageEntity update(LanguageEntity language, Long id);


}
