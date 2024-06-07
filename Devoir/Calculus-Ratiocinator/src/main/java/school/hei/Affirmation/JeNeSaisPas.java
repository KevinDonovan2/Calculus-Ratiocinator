package school.hei.Affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JeNeSaisPas extends Affirmation {
    protected String description_de_inconnu;

    public JeNeSaisPas(String description, String description_de_inconnu) {
        super(description);
        this.description_de_inconnu = description_de_inconnu;
    }

    @Override
    public String evaluer() {
        return "je ne sais pas";
    }
}