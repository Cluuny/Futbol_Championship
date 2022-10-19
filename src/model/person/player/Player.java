package model.person.player;

import model.person.Person;

/**
 * Clase abstracta Player para la definicion base de todos los jugadores
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public abstract class Player extends Person {
    private boolean holder;

    public Player(String name, String lastName, int age, boolean holder) {
        super(name, lastName, age);
        this.holder = holder;
    }

    public boolean isHolder() {
        return holder;
    }
}
