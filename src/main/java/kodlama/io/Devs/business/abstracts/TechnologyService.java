package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TechnologyService {

    List<GetAllTechnologyResponse> getAll();

    void addTechnology(TechnologyRequest technologyRequest);

    void update(Long id, TechnologyRequest createTechnologyRequest);

    void delete(Long id, TechnologyRequest createTechnologyRequest);
}
