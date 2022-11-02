package kodlama.io.Devs.business;

import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entity.LanguageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private LanguageService languageService;


    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        super();
        this.languageRepository = languageRepository;
    }


    @Override
    public List<LanguageEntity> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public LanguageEntity getById(Long id) {
        return languageRepository.getById(id);
    }

    @Override
    public void add(LanguageEntity language) {
        languageRepository.add(language);
    }

    @Override
    public void delete(LanguageEntity language, Long id) {
        languageRepository.delete(language, id);
    }

    @Override
    public void update(LanguageEntity language, Long id) {
        languageRepository.update(language, id);
    }
}
