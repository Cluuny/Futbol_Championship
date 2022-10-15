package model.person.player;

import model.person.Person;

public abstract class Player extends Person {
    private boolean holder;

    public Player(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public boolean isHolder() {
        return holder;
    }
}
