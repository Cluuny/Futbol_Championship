package model.person.player;

public class GoalKeeper extends Player{
    private int goalsReceived;

    public GoalKeeper(String name, String lastName, int age, int goalsReceived) {
        super(name, lastName, age);
        this.goalsReceived = goalsReceived;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }
}
