package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entity.LanguageEntity;

import java.util.List;

public interface LanguageRepository {
    List<LanguageEntity> getAll();

    LanguageEntity getById(Long id);

    void add(LanguageEntity language);

    void delete(Long id);

    void update(LanguageEntity language, Long id);
}
