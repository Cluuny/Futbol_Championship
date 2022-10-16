package model.person.player;

public class GoalKeeper extends Player{
    private int goalsReceived;

    public GoalKeeper(String name, String lastName, int age, int goalsReceived, boolean holder) {
        super(name, lastName, age, holder);
        this.goalsReceived = goalsReceived;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }
}
