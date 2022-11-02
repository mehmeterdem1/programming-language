package kodlama.io.Devs.entity;


import java.util.List;

public class LanguageEntity {

    private Long id;

    private String name;

    public LanguageEntity() {
    }

    public LanguageEntity(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
