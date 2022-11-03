package kodlama.io.Devs.web.controller;

import kodlama.io.Devs.business.LanguageService;
import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages/")
public class LanguageController {

    private final LanguageService languageService;


    @Autowired
    public LanguageController(LanguageService languageService, LanguageRepository languageRepository) {
        this.languageService = languageService;
    }

    @GetMapping("all")
    public List<GetAllLanguagesResponse> getAll() {
        return languageService.getAll();
    }

    @PostMapping("add")
    public void add(CreateLanguageRequest createLanguageRequest) {
        languageService.add(createLanguageRequest);
    }

}
