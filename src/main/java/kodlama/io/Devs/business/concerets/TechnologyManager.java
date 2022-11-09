package kodlama.io.Devs.business.concerets;

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Devs.entity.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {

    private final TechnologyRepository technologyRepository;

    public TechnologyManager(TechnologyRepository technologyRepository) {
        super();
        this.technologyRepository = technologyRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> technologyResponse = new ArrayList<>();

        for (Technology technology : technologies) {
            GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
            responseItem.setId(technology.getId());
            responseItem.setName(technology.getName());
            responseItem.setLanguageId(technology.getLanguageId());
            technologyResponse.add(responseItem);
        }
        return technologyResponse;
    }

    @Override
    public void addTechnology(TechnologyRequest technologyRequest) {
        Technology technology = new Technology();
        technology.setName(technologyRequest.getName());
        technology.setLanguageId(technologyRequest.getLanguageId());
        technologyRepository.save(technology);
    }

    @Override
    public void update(Long id, TechnologyRequest createTechnologyRequest) {
        Technology technology = technologyRepository.findById(id).get();
        technology.setName(createTechnologyRequest.getName());
        technology.setLanguageId(createTechnologyRequest.getLanguageId());
        technologyRepository.save(technology);

    }

    @Override
    public void delete(Long id, TechnologyRequest createTechnologyRequest) {
        technologyRepository.deleteById(id);
    }
}
