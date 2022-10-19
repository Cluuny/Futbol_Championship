package presenter;

import model.Championship;
import model.Team;
import model.person.Coach;
import model.person.player.*;
import view.View;

public class Test {
    private Championship championship;
    private View view;
    private String menuMessage = "\nBienvenido, porfavor ingrese el numero asociado a la opcion que desea esocger: " +
            "\n1. Ver equipos de Futbol" +
            "\n2. Gestionar campeonato" +
            "\n3. Salir";
    private String championshipMenuMessage = "porfavor ingrese el numero asociado a la opcion que desea esocger: " +
            "\n1. Ver reglas del campeonato" +
            "\n2. Jugar Siguiente fecha" +
            "\n3. Ver tabla de posiciones" +
            "\n4. Volver al menu principal";

    public Test() {
        view = new View();
        championship = new Championship(createTeams()[0], createTeams()[1], createTeams()[2]);
    }

    public void run() {
        do {
            int option = view.ShowMenu(menuMessage);
            switch (option) {
                case 1:
                    view.print(showTeamsInformation());
                    break;
                case 2:
                    view.print(championship.championshipMenu(view.ShowMenu(championshipMenuMessage)));
                    break;
                case 3:
                    view.print("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    view.print("Error, porfavor vuelva a intentarlo.");
            }
        } while (true);
    }

    /**
     * @return Team[]
     */
    public Team[] createTeams() {
        Team[] teams = new Team[3];
        Coach coachTeam1 = new Coach("Carlos", "Queiroz", 66, 30, true);
        GoalKeeper goalKeeperTeam1 = new GoalKeeper("David", "Ospina", 30, 10, true);
        Defender[] defendersTeam1 = new Defender[4];
        defendersTeam1[0] = new Defender("Yerry", "Mina", 24, true);
        defendersTeam1[1] = new Defender("Davison", "Sánchez", 23, true);
        defendersTeam1[2] = new Defender("William", "Tesillo", 29, true);
        defendersTeam1[3] = new Defender("Stefan", "Medina", 29, true);
        Midfielders[] midfieldersTeam1 = new Midfielders[4];
        midfieldersTeam1[0] = new Midfielders("Mateus", "Uribe", 28, 12, true);
        midfieldersTeam1[1] = new Midfielders("Wilmar", "Barrios", 25, 12, true);
        midfieldersTeam1[2] = new Midfielders("Juan Guillermo", "Cuadrado", 31, 10, true);
        midfieldersTeam1[3] = new Midfielders("James", "Rodríguez", 28, 32, true);
        Forwards[] forwardsTeam1 = new Forwards[2];
        forwardsTeam1[0] = new Forwards("Radamel", "Falcao", 33, 15, true);
        forwardsTeam1[1] = new Forwards("Duván", "Zapata", 28, 12, true);
        Team team1 = new Team("Selección Colombiana de Futbol", "Colombia", coachTeam1, 1, defendersTeam1,
                forwardsTeam1,
                midfieldersTeam1, goalKeeperTeam1);
        teams[0] = team1;

        Coach coachTeam2 = new Coach("Lionel", "Scaloni", 44, 5, true);
        GoalKeeper goalKeeperTeam2 = new GoalKeeper("Emiliano", "Martinez", 30, 11, true);
        Defender[] defendersTeam2 = new Defender[4];
        defendersTeam2[0] = new Defender("Cristian", "Romero", 24, true);
        defendersTeam2[1] = new Defender("Lisandro", "Martinez", 24, true);
        defendersTeam2[2] = new Defender("Facundo", "Medina", 23, true);
        defendersTeam2[3] = new Defender("Nehuén", "Pérez", 22, true);
        Midfielders[] midfieldersTeam2 = new Midfielders[4];
        midfieldersTeam2[0] = new Midfielders("Nicolás", "Tagliafico", 30, 12, true);
        midfieldersTeam2[1] = new Midfielders("Lionel", "Messi", 24, 10, true);
        midfieldersTeam2[2] = new Midfielders("Gonzalo", "Motiel", 25, 11, true);
        midfieldersTeam2[3] = new Midfielders("Rodrigo", "De Paul", 28, 23, true);
        Forwards[] forwardsTeam2 = new Forwards[2];
        forwardsTeam2[0] = new Forwards("Lautaro", "Martinez", 25, 4, true);
        forwardsTeam2[1] = new Forwards("Julian", "Alvarez", 22, 12, true);
        Team team2 = new Team("Selección Argentina de Futbol", "Argentina", coachTeam2, 2, defendersTeam2,
                forwardsTeam2,
                midfieldersTeam2, goalKeeperTeam2);
        teams[1] = team2;

        Coach coachTeam3 = new Coach("Gerardo", "Martino", 59, 24, false);
        GoalKeeper goalKeeperTeam3 = new GoalKeeper("Guillermo", "Ochoa", 37, 131, true);
        Defender[] defendersTeam3 = new Defender[4];
        defendersTeam3[0] = new Defender("Cesar", "Montes", 25, true);
        defendersTeam3[1] = new Defender("Johan", "Vásquez", 23, true);
        defendersTeam3[2] = new Defender("Nestor", "Araujo", 31, true);
        defendersTeam3[3] = new Defender("Hector", "Moreno", 34, true);
        Midfielders[] midfieldersTeam3 = new Midfielders[4];
        midfieldersTeam3[0] = new Midfielders("Carlos", "Rodríguez", 25, 15, true);
        midfieldersTeam3[1] = new Midfielders("Érick", "Gutiérrez", 27, 14, true);
        midfieldersTeam3[2] = new Midfielders("Luis", "Romero", 27, 10, true);
        midfieldersTeam3[3] = new Midfielders("Fernando", "Beltrán", 24, 9, true);
        Forwards[] forwardsTeam3 = new Forwards[2];
        forwardsTeam3[0] = new Forwards("Raul", "Jimenez", 31, 40, true);
        forwardsTeam3[1] = new Forwards("Henry", "Martín", 29, 30, true);
        Team team3 = new Team("Seleccion Mexicana de Futbol", "Mexico", coachTeam3, 3, defendersTeam3, forwardsTeam3,
                midfieldersTeam3, goalKeeperTeam3);
        teams[2] = team3;

        return teams;
    }

    /**
     * @return String
     */
    public String showTeamsInformation() {
        switch (view.ShowMenu("Ver información de: " + "\n1. " + createTeams()[0].getName() + "\n2. "
                + createTeams()[1].getName() + "\n3. " + createTeams()[2].getName())) {
            case 1:
                return createTeams()[0].showInformation();
            case 2:
                return createTeams()[1].showInformation();
            case 3:
                return createTeams()[2].showInformation();
            default:
                return "Error, porfavor intentalo nuevamente";
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }
}