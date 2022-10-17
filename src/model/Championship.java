package model;

public class Championship {

    private String championshipRules = "El campeonato actualmente está conformado por 3 equipos, se van a jugar 3 partidos y la distribucioón de los puntos es la siguiente: "
            + "\nGanador : 3 puntos" + "\nEmpate : 1 punto" + "\nPerdedor : 0 puntos"
            + "\nQuien tenga mas puntos al final del campeonato, gana.";
    private Team team1;
    private Team team2;
    private Team team3;
    private int randomValue;

    public Championship(Team team1, Team team2, Team team3) {
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getTeam3() {
        return team3;
    }

    public String decideByOption(int option) {
        switch (option) {
            case 1:
                return championshipRules;
            default:
            case 2:
                return play();
        }
    }

    public int generateRandomValue() {
        randomValue = (int) Math.floor(Math.random() * 3);
        return randomValue;
    }

    public String play() {
        if (team1.getIdTeam() == generateRandomValue()) {
            team1.setGaming(true);
            return "Equipo 1";
        } else if (team2.getIdTeam() == generateRandomValue()) {
            team2.setGaming(true);
            return "Equipo 2";
        } else {
            team3.setGaming(true);
            return "Equipo 3";
        }
    }
}
