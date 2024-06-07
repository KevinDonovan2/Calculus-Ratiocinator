import org.junit.jupiter.api.Test;
import school.hei.Affirmation.JeNeSaisPas;
import org.junit.jupiter.api.Test;
import school.hei.Affirmation.Mensonge;
import school.hei.Affirmation.Verite;
import school.hei.conjonction.Donc;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoncTest {

    @Test
    public void PremiereVerite_et_DeuxiemeMensonge(){
        Verite verite1 = new Verite("Lou est beau", "Lou est riche");
        Mensonge mensonge1 = new Mensonge("Lou est un menteur", "Lou est un menteur");

        Donc donc = new Donc(verite1, mensonge1);

        assertEquals("faux", donc.evaluer(),"La premiere affirmation est vrai et la deuxieme est fausse, donc le résultat devrait être faux.");
    }

    @Test
    public void PremiereMensonge_et_DeuxiemeVerite(){
        Verite verite1 = new Verite("Lou est beau", "Lou est riche");
        Mensonge mensonge1 = new Mensonge("Lou est un menteur", "Lou est un tueur");

        Donc donc = new Donc(mensonge1, verite1);

        assertEquals("vrai", donc.evaluer(), "La premiere affirmation est faux et la deuxieme est vrai, donc le resultat devrait etre vrai");
    }
}