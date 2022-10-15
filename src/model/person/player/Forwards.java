package model.person.player;

public class Forwards extends Player {
    private int goalsScored;

    public Forwards(String name, String lastName, int age, int goalsScored) {
        super(name, lastName, age);
        this.goalsScored = goalsScored;
    }

    public int getGoalsScored() {
        return goalsScored;
    }
}
