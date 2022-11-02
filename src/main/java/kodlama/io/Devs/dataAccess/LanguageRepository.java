package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entity.LanguageEntity;

import java.util.List;

public interface LanguageRepository {
    List<LanguageEntity> getAll();

    LanguageEntity getById(Long id);

    void save(LanguageEntity language);

    void delete(LanguageEntity language, Long id);

    LanguageEntity update(LanguageEntity language, Long id);
}
