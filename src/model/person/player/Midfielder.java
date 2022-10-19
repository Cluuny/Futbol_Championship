package model.person.player;

/**
 * Clase Midfielder para la instanciación de objetos de tipo Midfielder  
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public class Midfielder extends Player {
    private int assistance;

    public Midfielder(String name, String lastName, int age, int assistance, boolean holder) {
        super(name, lastName, age, holder);
        this.assistance = assistance;
    }

    public int getAssistance() {
        return assistance;
    }
}
