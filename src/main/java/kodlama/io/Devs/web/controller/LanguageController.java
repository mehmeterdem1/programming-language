package kodlama.io.Devs.web.controller;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetAllLanguagesWithTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages/")
public class LanguageController {

    private final LanguageService languageService;


    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("all")
    public List<GetAllLanguagesResponse> getAll() {
        return languageService.getAll();
    }

    @GetMapping("all-language-with-technology")
    public List<GetAllLanguagesWithTechnologyResponse> getAllLanguagesWithTechnology() {
        return languageService.getAllWithTechnology();
    }

    @PostMapping("add")
    public void add(LanguageRequest createLanguageRequest) {
        languageService.add(createLanguageRequest);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id, LanguageRequest createLanguageRequest) {
        languageService.remove(id, createLanguageRequest);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable Long id, LanguageRequest createLanguageRequest) {
        languageService.update(id, createLanguageRequest);
    }

}
