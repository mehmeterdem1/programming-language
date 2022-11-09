package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetAllLanguagesWithTechnologyResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LanguageService {

    List<GetAllLanguagesResponse> getAll();

    List<GetAllLanguagesWithTechnologyResponse> getAllWithTechnology();

    void add(LanguageRequest createLanguageRequest);

    void update(Long id, LanguageRequest createLanguageRequest);

    void remove(Long id, LanguageRequest createLanguageRequest);

}
