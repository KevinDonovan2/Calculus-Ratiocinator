package school.hei.Affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mensonge extends Affirmation{
    protected String descriptionMensonge;

    public Mensonge(String description, String descriptionMensonge) {
        super(description);
        this.descriptionMensonge = descriptionMensonge;
    }

    @Override
    public String evaluer() {
        return "faux";
    }
}
