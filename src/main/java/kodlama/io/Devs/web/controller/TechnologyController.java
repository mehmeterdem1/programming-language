package kodlama.io.Devs.web.controller;

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages/technology")
public class TechnologyController {
    private final TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("all")
    public List<GetAllTechnologyResponse> getAll() {
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void addTechnology(TechnologyRequest technologyRequest) {
        technologyService.addTechnology(technologyRequest);
    }

    @PutMapping("update/{id}")
    public void updateTecnology(@PathVariable Long id, TechnologyRequest technologyRequest) {
        technologyService.update(id, technologyRequest);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTecnologyById(@PathVariable Long id, TechnologyRequest technologyRequest) {
        technologyService.delete(id, technologyRequest);
    }
}
