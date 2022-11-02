package kodlama.io.Devs.business;

import kodlama.io.Devs.entity.LanguageEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LanguageService {

    List<LanguageEntity> getAll();

    LanguageEntity getById(Long id);

    void add(LanguageEntity language);

    void delete(Long id);

    void update(LanguageEntity language, Long id);


}
