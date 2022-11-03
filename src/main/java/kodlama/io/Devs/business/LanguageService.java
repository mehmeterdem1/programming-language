package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LanguageService {

    List<GetAllLanguagesResponse> getAll();

    void add(CreateLanguageRequest createLanguageRequest);

}
