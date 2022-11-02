package kodlama.io.Devs.web.controller;

import kodlama.io.Devs.business.LanguageService;
import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entity.LanguageEntity;
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
    public List<LanguageEntity> getAll() {
        return languageService.getAll();
    }

    @GetMapping("{id}")
    public LanguageEntity getById(@PathVariable() Long id) {
        return languageService.getById(id);
    }

    @PostMapping
    public void addLanguage(@RequestBody LanguageEntity language) {
        languageService.add(language);
    }

    @PutMapping("update/{id}")
    public void updateLanguage(@RequestBody LanguageEntity language, @PathVariable Long id) {
        languageService.update(language, id);
    }
}
