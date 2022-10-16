package model;
import model.person.Coach; 
import model.person.player.*;

public class Team {
    
    private String name;
    private String country;
    private Coach coach;
    private GoalKeeper goalKeeper; 
    private Defender[] defender;
    private Forwards [] forwards;
    private Midfielders [] midfielders;

    public Team(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Team(String name, String country, Coach coach, Defender[] defender, Forwards[] forwards, Midfielders[] midfielders, GoalKeeper goalKeeper) {
        this(name, country);
        this.coach = coach;
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
        information += "Nombre del equipo: \n" + name + " Pais: \n" + country + "Entrenador: \n" + "  -  " + coach.getName() + "Portero: \n" + "  -  " + goalKeeper.getName();
        
        information += "\nDefensas: \n";
        for (int i = 0; i < defender.length; i++) {
            information += "  -  " + defender[i].getName() + " " + defender[i].getLastName() + " , Edad: " + defender[i].getAge() + " , Titalar" + defender[i].isHolder();
        }

        information += "\n Medio Campos: \n";
        for (int i = 0; i < midfielders.length; i++) {
            information += "  -  " + midfielders[i].getName() + " " + midfielders[i].getLastName() + " , Edad: " + midfielders[i].getAge() + " , Titalar: " + midfielders[i].isHolder() + " , Asistencias: " + midfielders[i].getAssistance();
        }

        information += "\n Delanteros: \n";
        for (int i = 0; i < forwards.length; i++) {
            information += "  -  " + forwards[i].getName() + " " + forwards[i].getLastName() + " , Edad: " + forwards[i].getAge() + " , Goles: " + forwards[i].getGoalsScored();
        }
        return information;
    } 
}