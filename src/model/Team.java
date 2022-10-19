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
    private int points;
    private int idTeam;
    private int gamesWon;
    private int gamesTied;
    private int gamesLost;
    private int matchGoals;
    private int goalsScored;
    private int goalsAgainst;
    private int goalsDifference;
    private GoalKeeper goalKeeper;
    private Defender[] defender;
    private Forwards[] forwards;
    private Midfielder[] midfielders;

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
            Midfielder[] midfielders, GoalKeeper goalKeeper) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getMatchGoals() {
        return matchGoals;
    }

    public void setMatchGoals(int matchGoals) {
        this.matchGoals = matchGoals;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalsDifference() {
        return goalsDifference;
    }

    public void setGoalsDifference(int goalsDifference) {
        this.goalsDifference = goalsDifference;
    }

    public GoalKeeper getGoalKeeper() {
        return goalKeeper;
    }

    public void setGoalKeeper(GoalKeeper goalKeeper) {
        this.goalKeeper = goalKeeper;
    }

    public Defender[] getDefender() {
        return defender;
    }

    public void setDefender(Defender[] defender) {
        this.defender = defender;
    }

    public Forwards[] getForwards() {
        return forwards;
    }

    public void setForwards(Forwards[] forwards) {
        this.forwards = forwards;
    }

    public Midfielder[] getMidfielders() {
        return midfielders;
    }

    public void setMidfielders(Midfielder[] midfielders) {
        this.midfielders = midfielders;
    }

    
    /** 
     * Metodo con el cual re retorna la informacion de todo el equipo, es decir, su plantilla de jugadores
     * @return String
     */
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