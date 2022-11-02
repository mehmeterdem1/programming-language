package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entity.LanguageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<LanguageEntity> languageList;

    @Autowired
    public InMemoryLanguageRepository() {

        languageList = new ArrayList<>();
        languageList.add(new LanguageEntity(1L, "Python"));
        languageList.add(new LanguageEntity(2L, "Java"));
        languageList.add(new LanguageEntity(3L, "C#"));
        languageList.add(new LanguageEntity(4L, "C++"));
    }

    @Override
    public List<LanguageEntity> getAll() {
        return languageList;
    }

    @Override
    public LanguageEntity getById(Long id) {
        for (LanguageEntity languageEntity : languageList) {
            if (languageEntity.getId() == id) {
                return languageEntity;
            }
        }
        return null;
    }

    @Override
    public void add(LanguageEntity language) {
        languageList.add(language);
    }

    @Override
    public void delete(LanguageEntity language, Long id) {
        languageList.removeIf(lang -> lang.getId() == id);
    }

    @Override
    public void update(LanguageEntity language, Long id) {
        for (LanguageEntity languageEntity : languageList) {
            if (languageEntity.getId() == id) {
                languageEntity.setName(language.getName());
            }
        }
    }
}
