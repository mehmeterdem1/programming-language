package kodlama.io.Devs.business.concerets;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetAllLanguagesWithTechnologyResponse;
import kodlama.io.Devs.business.responses.GetAllTechnologyForLanguage;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Devs.entity.Language;
import kodlama.io.Devs.entity.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class LanguageManager implements LanguageService {
    private final LanguageRepository languageRepository;

    private final TechnologyRepository technologyRepository;



    public LanguageManager(LanguageRepository languageRepository, TechnologyRepository technologyRepository) {
        super();
        this.languageRepository = languageRepository;
        this.technologyRepository = technologyRepository;
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
    public List<GetAllLanguagesWithTechnologyResponse> getAllWithTechnology() {

        List<Language> languages = languageRepository.findAll();

        List<Technology> technologies = technologyRepository.findAll();

        List<GetAllLanguagesWithTechnologyResponse> responseList = new ArrayList<>();

        for (Language language : languages) {
            GetAllLanguagesWithTechnologyResponse response = new GetAllLanguagesWithTechnologyResponse();
            response.setId(language.getId());
            response.setLanguageName(language.getName());

            List<GetAllTechnologyForLanguage> technologyList = new ArrayList<>();

            for (Technology technology : technologies) {
                if (Objects.equals(technology.getLanguageId(), language.getId())) {
                    GetAllTechnologyForLanguage technologyResponse = new GetAllTechnologyForLanguage();
                    technologyResponse.setId(technology.getId());
                    technologyResponse.setTechnologyName(technology.getName());
                    technologyList.add(technologyResponse);
                }
            }

            response.setTechnology(technologyList);
            responseList.add(response);

        }

        return responseList;
    }

    @Override
    public void add(LanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setName(createLanguageRequest.getName());
        languageRepository.save(language);
    }

    @Override
    public void update(Long id, LanguageRequest createLanguageRequest) {
        Language language = languageRepository.findById(id).get();
        language.setName(createLanguageRequest.getName());
        languageRepository.save(language);
    }

    @Override
    public void remove(Long id, LanguageRequest createLanguageRequest) {
        languageRepository.deleteById(id);
    }


}
