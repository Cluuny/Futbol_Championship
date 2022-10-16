package presenter;

import model.Team;
import model.person.Coach;
import model.person.player.*;
import view.View;

public class Test {
    private View view;

    public Test(View view) {
        this.view = view;
    }

    public void run() {
        Coach coach = new Coach("Carlos", "Queiroz", 66, 30, true);
        GoalKeeper goalKeeper = new GoalKeeper("David", "Ospina", 30, 10);
        Defender[] defenders = new Defender[4];
        defenders[0] = new Defender("Yerry", "Mina", 24);
        defenders[1] = new Defender("Davison", "Sánchez", 23);
        defenders[2] = new Defender("William", "Tesillo", 29);
        defenders[3] = new Defender("Stefan", "Medina", 29);
        Midfielders[] midfielders = new Midfielders[4];
        midfielders[0] = new Midfielders("Mateus", "Uribe", 28, 12);
        midfielders[1] = new Midfielders("Wilmar", "Barrios", 25, 12);
        midfielders[2] = new Midfielders("Juan Guillermo", "Cuadrado", 31, 10);
        midfielders[3] = new Midfielders("James", "Rodríguez", 28, 32);
        Forwards[] forwards = new Forwards[2];
        forwards[0] = new Forwards("Radamel", "Falcao", 33, 15);
        forwards[1] = new Forwards("Duván", "Zapata", 28, 12);
        Team team = new Team("Colombia", "Colombia", coach, defenders, forwards, midfielders, goalKeeper);
        view.print(team.showInformation());
    }

    public static void main(String[] args) {
        View view = new View();
        Test test = new Test(view);
        test.run();
    }
}