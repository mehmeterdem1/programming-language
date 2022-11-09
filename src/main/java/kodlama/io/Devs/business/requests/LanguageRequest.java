package kodlama.io.Devs.business.requests;

import kodlama.io.Devs.entity.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageRequest extends Language {

    @NotNull
    private String name;

    private String technology;
}
