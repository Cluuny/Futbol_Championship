package model.person.player;

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
