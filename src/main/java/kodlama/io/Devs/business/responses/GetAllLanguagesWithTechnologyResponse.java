package kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesWithTechnologyResponse {

    private Long id;

    private String languageName;

    private List technology;
}
