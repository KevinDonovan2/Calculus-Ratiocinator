package school.hei.conjonction;
import school.hei.Affirmation.Affirmation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ou extends Affirmation {
    private Affirmation affirmation1, affirmation2;

    public Ou(Affirmation affirmation1, Affirmation affirmation2) {
        super(affirmation1.getDescription() + "Ou" + affirmation2.getDescription());
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }

    @Override
    public String evaluer() {
        String premiereAffirmation = affirmation1.evaluer();
        String deuxiemeAffirmation = affirmation2.evaluer();

        if (premiereAffirmation.equals("vrai") || deuxiemeAffirmation.equals("vrai")) {
            return "vrai";
        }else {
            return "faux";
        }
    }
}