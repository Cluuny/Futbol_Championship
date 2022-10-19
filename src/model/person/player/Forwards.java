package model.person.player;

/**
 * Clase Forwards para la instanciación de objetos de tipo Forwards
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public class Forwards extends Player {
    private int goalsScored;

    public Forwards(String name, String lastName, int age, int goalsScored, boolean holder) {
        super(name, lastName, age, holder);
        this.goalsScored = goalsScored;
    }

    public int getGoalsScored() {
        return goalsScored;
    }
}
