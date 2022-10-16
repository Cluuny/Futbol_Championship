package model.person.player;

import model.person.Person;

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
