package model;

import model.person.Coach;
import model.person.player.*;

/**
 * Clase en donde se almacen la informcaion del equipo de futbol
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 15/10/2022
 */

public class Team {

    private String name;
    private String country;
    private Coach coach;
    private int idTeam;
    private GoalKeeper goalKeeper;
    private Defender[] defender;
    private Forwards[] forwards;
    private Midfielders[] midfielders;

    /**
     * Primer metodo constructor parametrizado
     * 
     * @param name    Nombre del equipo
     * @param country País de donde viene el equipo
     */

    public Team(String name, String country) {
        this.name = name;
        this.country = country;
    }

    /**
     * Segundo metodo constructor parametrizado que invoca el primer metodo
     * constructor e inicializa a los jugadores que conforman el equipo
     * 
     * @param name        Nombre del equipo
     * @param country     País de donde viene el equipo
     * @param coach       Nombre del equipo
     * @param defender    País de donde viene el equipo
     * @param forwards    Nombre del equipo
     * @param midfielders País de donde viene el equipo
     * @param goalKeeper  País de donde viene el equipo
     */

    public Team(String name, String country, Coach coach, int idTEam, Defender[] defender, Forwards[] forwards,
            Midfielders[] midfielders, GoalKeeper goalKeeper) {
        this(name, country);
        this.coach = coach;
        this.idTeam = idTEam;
        this.defender = defender;
        this.forwards = forwards;
        this.midfielders = midfielders;
        this.goalKeeper = goalKeeper;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Coach getCoach() {
        return coach;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public Defender[] getDefender() {
        return defender;
    }

    public Forwards[] getForwards() {
        return forwards;
    }

    public Midfielders[] getMidfielders() {
        return midfielders;
    }

    public GoalKeeper getGoalKeeper() {
        return goalKeeper;
    }

    public String showInformation() {
        String information = "";
        information += "Nombre del equipo: " + name + "\n Pais: " + country + "\n Entrenador: \n" + "  -  "
                + coach.getName() + " " + coach.getLastName() + "\n Portero: \n" + "  -  " + goalKeeper.getName() + " "
                + goalKeeper.getLastName() + ", Goles recividos: " + goalKeeper.getGoalsReceived();

        information += "\nDefensas: \n";
        for (int i = 0; i < defender.length; i++) {
            information += "  -  " + defender[i].getName() + " " + defender[i].getLastName() + ", Edad: "
                    + defender[i].getAge() + ", Titular: " + defender[i].isHolder() + "\n";
        }

        information += "\n Medio Campos: \n";
        for (int i = 0; i < midfielders.length; i++) {
            information += "  -  " + midfielders[i].getName() + " " + midfielders[i].getLastName() + ", Edad: "
                    + midfielders[i].getAge() + ", Titular: " + midfielders[i].isHolder() + ", Asistencias: "
                    + midfielders[i].getAssistance() + "\n";
        }

        information += "\n Delanteros: \n";
        for (int i = 0; i < forwards.length; i++) {
            information += "  -  " + forwards[i].getName() + " " + forwards[i].getLastName() + ", Edad: "
                    + forwards[i].getAge() + ", Goles: " + forwards[i].getGoalsScored() + ", Titular: "
                    + midfielders[i].isHolder() + "\n";
        }
        return information;
    }
}