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
        GoalKeeper goalKeeper = new GoalKeeper("David", "Ospina", 30, 10, true);
        Defender[] defenders = new Defender[4];
        defenders[0] = new Defender("Yerry", "Mina", 24, true);
        defenders[1] = new Defender("Davison", "Sánchez", 23, true);
        defenders[2] = new Defender("William", "Tesillo", 29, true);
        defenders[3] = new Defender("Stefan", "Medina", 29, true);
        Midfielders[] midfielders = new Midfielders[4];
        midfielders[0] = new Midfielders("Mateus", "Uribe", 28, 12, true);
        midfielders[1] = new Midfielders("Wilmar", "Barrios", 25, 12, true);
        midfielders[2] = new Midfielders("Juan Guillermo", "Cuadrado", 31, 10, true);
        midfielders[3] = new Midfielders("James", "Rodríguez", 28, 32, true);
        Forwards[] forwards = new Forwards[2];
        forwards[0] = new Forwards("Radamel", "Falcao", 33, 15, true);
        forwards[1] = new Forwards("Duván", "Zapata", 28, 12, true);
        Team team = new Team("Colombia", "Colombia", coach, defenders, forwards, midfielders, goalKeeper);
        view.print(team.showInformation());
    }

    public static void main(String[] args) {
        View view = new View();
        Test test = new Test(view);
        test.run();
    }
}