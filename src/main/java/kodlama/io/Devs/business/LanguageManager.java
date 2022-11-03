package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entity.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private LanguageService languageService;


    public LanguageManager(LanguageRepository languageRepository) {
        super();
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllLanguagesResponse> getAll() {

        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses = new ArrayList<>();

        for (Language language : languages) {
            GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());

            languagesResponses.add(responseItem);
        }
        return languagesResponses;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setName(createLanguageRequest.getName());
        this.languageRepository.save(language);
    }
}
