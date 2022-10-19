package model.person.player;

/**
 * Clase GoalKeeper para la instanciación de objetos de tipo GoalKeeper
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public class GoalKeeper extends Player {
    private int goalsReceived;

    public GoalKeeper(String name, String lastName, int age, int goalsReceived, boolean holder) {
        super(name, lastName, age, holder);
        this.goalsReceived = goalsReceived;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }
}
