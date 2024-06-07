package school.hei.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Verite extends Affirmation {
    private String descriptionVerite;

    public Verite(String description, String descriptionVerite) {
        super(description);
        this.descriptionVerite = descriptionVerite;
    }

    @Override
    public String evaluer() {
        return "vrai";
    }
}