package model.person.player;

public class Midfielders extends Player{
    private int assistance;

    public Midfielders(String name, String lastName, int age, int assistance, boolean holder) {
        super(name, lastName, age, holder);
        this.assistance = assistance;
    }

    public int getAssistance() {
        return assistance;
    }
}
