package presenter;

import model.Championship;
import model.Team;
import model.person.Coach;
import model.person.player.*;
import view.View;

/**
 * Clase Test, contenedora del metodo main desde el cual parte la ejecucion del programa
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

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

    /**
     * Unico metodo que se ejecuta en el main, el cual está encargado de la ejecucion correcta del programa
     */
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
     * Metodo encargado de la creacion de los 3 equipos que conforman el campeonato de futbol
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
        Midfielder[] midfieldersTeam1 = new Midfielder[4];
        midfieldersTeam1[0] = new Midfielder("Mateus", "Uribe", 28, 12, true);
        midfieldersTeam1[1] = new Midfielder("Wilmar", "Barrios", 25, 12, true);
        midfieldersTeam1[2] = new Midfielder("Juan Guillermo", "Cuadrado", 31, 10, true);
        midfieldersTeam1[3] = new Midfielder("James", "Rodríguez", 28, 32, true);
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
        Midfielder[] midfieldersTeam2 = new Midfielder[4];
        midfieldersTeam2[0] = new Midfielder("Nicolás", "Tagliafico", 30, 12, true);
        midfieldersTeam2[1] = new Midfielder("Lionel", "Messi", 24, 10, true);
        midfieldersTeam2[2] = new Midfielder("Gonzalo", "Motiel", 25, 11, true);
        midfieldersTeam2[3] = new Midfielder("Rodrigo", "De Paul", 28, 23, true);
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
        Midfielder[] midfieldersTeam3 = new Midfielder[4];
        midfieldersTeam3[0] = new Midfielder("Carlos", "Rodríguez", 25, 15, true);
        midfieldersTeam3[1] = new Midfielder("Érick", "Gutiérrez", 27, 14, true);
        midfieldersTeam3[2] = new Midfielder("Luis", "Romero", 27, 10, true);
        midfieldersTeam3[3] = new Midfielder("Fernando", "Beltrán", 24, 9, true);
        Forwards[] forwardsTeam3 = new Forwards[2];
        forwardsTeam3[0] = new Forwards("Raul", "Jimenez", 31, 40, true);
        forwardsTeam3[1] = new Forwards("Henry", "Martín", 29, 30, true);
        Team team3 = new Team("Seleccion Mexicana de Futbol", "Mexico", coachTeam3, 3, defendersTeam3, forwardsTeam3,
                midfieldersTeam3, goalKeeperTeam3);
        teams[2] = team3;

        return teams;
    }

    /**
     * Metodo encargado de mostrar la informacion que se retorna desde la clase Team
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
     * Punto de partida del programa
     * @param args
     */
    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }
}