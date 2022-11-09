package kodlama.io.Devs.business.requests;

import kodlama.io.Devs.entity.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyRequest extends Technology {

    @NotNull
    private String name;

    @NotNull
    private Long languageId;

}
