package school.hei.Affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JeNeSaisPas extends Affirmation {
    protected String descriptionJeNeSaisPas;

    public JeNeSaisPas(String description, String descriptionJeNeSaisPas) {
        super(description);
        this.descriptionJeNeSaisPas = descriptionJeNeSaisPas;
    }

    @Override
    public String evaluer() {
        return "je ne sais pas";
    }
}