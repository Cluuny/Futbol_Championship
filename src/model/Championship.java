package model;

/**
 * Clase Championship desde la cual se gestiona completamente el campeonato de futbol
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public class Championship {

    private String championshipRules = "El campeonato actualmente está conformado por 3 equipos, se van a jugar 3 partidos y la distribucioón de los puntos es la siguiente: "
            + "\nGanador : 3 puntos" + "\nEmpate : 1 punto" + "\nPerdedor : 0 puntos"
            + "\nQuien tenga mas puntos al final del campeonato, gana.";
    private Team team1;
    private Team team2;
    private Team team3;
    private int randomNumber;
    private int dayRound = 0;

    public Championship(Team team1, Team team2, Team team3) {
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
    }

    public String getChampionshipRules() {
        return championshipRules;
    }

    public void setChampionshipRules(String championshipRules) {
        this.championshipRules = championshipRules;
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

    public int getDayRound() {
        return dayRound;
    }

    public void setDayRound(int dayRound) {
        this.dayRound = dayRound;
    }

    
    /** 
     * Metodo encargado de la generacion de un numero aleatorio el cual significará el numero de goles anotados por un equipo en cada encuentro
     * @return int
     */
    public int generateRandomNumber() {
        randomNumber = (int) Math.floor(Math.random() * 5);
        return randomNumber;
    }

    
    /** 
     * Sub menu de la administración del campeonato, desde aqui se controla la buena ejecucion de esta parte del programa
     * @param optionChampionship
     * @return String
     */
    public String championshipMenu(int optionChampionship) {
        switch (optionChampionship) {
            case 1:
                return getChampionshipRules();
            case 2:
                return playDay();
            case 3:
                return makeLeaderBoard();
            case 4:
                break;
        }
        return "Volviendo al menú principal...";
    }

    
    /** 
     * Metodo encargado de la creacion de los juegos.
     * Aqui se decide practicamente todo sobre los equipos y se hacen los ajustes pertienentes a las estadisiticas de los mismos
     * @param teamPlayer1
     * @param teamPlayer2
     * @return String
     */
    public String playMatch(Team teamPlayer1, Team teamPlayer2) {
        teamPlayer1.setMatchGoals(generateRandomNumber());
        teamPlayer2.setMatchGoals(generateRandomNumber());
        // equipo 1 gana
        if (teamPlayer1.getMatchGoals() > teamPlayer2.getMatchGoals()) {
            // actualizacion de las estadisiticas del equipo 1
            teamPlayer1.setPoints(teamPlayer1.getPoints() + 3);
            teamPlayer1.setGamesWon(teamPlayer1.getGamesWon() + 1);
            teamPlayer1.setGoalsScored(teamPlayer1.getGoalsScored() + teamPlayer1.getMatchGoals());
            teamPlayer1.setGoalsAgainst(teamPlayer1.getGoalsAgainst() + teamPlayer2.getMatchGoals());

            // actualizacion de las estadisiticas del equipo 2
            teamPlayer2.setGamesLost(teamPlayer2.getGamesLost() + 1);
            teamPlayer2.setGoalsScored(teamPlayer2.getGoalsScored() + teamPlayer2.getMatchGoals());
            teamPlayer2.setGoalsAgainst(teamPlayer2.getGoalsAgainst() + teamPlayer1.getMatchGoals());

            teamPlayer1.setMatchGoals(0);
            teamPlayer2.setMatchGoals(0);
            return teamPlayer1.getName() + " VS. " + teamPlayer2.getName() + " -> " + "Ganador: "
                    + teamPlayer1.getName();
        }
        // Empate
        else if (teamPlayer1.getMatchGoals() == teamPlayer2.getMatchGoals()) {
            // actualizacion de las estadisiticas del equipo 1
            teamPlayer1.setPoints(teamPlayer1.getPoints() + 1);
            teamPlayer1.setGoalsScored(teamPlayer1.getGoalsScored() + teamPlayer1.getMatchGoals());
            teamPlayer1.setGoalsAgainst(teamPlayer1.getGoalsAgainst() + teamPlayer2.getMatchGoals());
            teamPlayer1.setGamesTied(teamPlayer1.getGamesTied() + 1);

            // actualizacion de las estadisiticas del equipo 2
            teamPlayer2.setPoints(teamPlayer2.getPoints() + 1);
            teamPlayer2.setGoalsScored(teamPlayer2.getGoalsScored() + teamPlayer2.getMatchGoals());
            teamPlayer2.setGoalsAgainst(teamPlayer2.getGoalsAgainst() + teamPlayer1.getMatchGoals());
            teamPlayer2.setGamesTied(teamPlayer2.getGamesTied() + 1);

            teamPlayer1.setMatchGoals(0);
            teamPlayer2.setMatchGoals(0);
            return teamPlayer1.getName() + " VS. " + teamPlayer2.getName() + " -> " + "Empate";

        }
        // Equipo 2 gana
        else {
            // actualizacion de las estadisiticas del equipo 1
            teamPlayer1.setGamesLost(teamPlayer1.getGamesLost() + 1);
            teamPlayer1.setGoalsScored(teamPlayer1.getGoalsScored() + teamPlayer1.getMatchGoals());
            teamPlayer1.setGoalsAgainst(teamPlayer1.getGoalsAgainst() + teamPlayer2.getMatchGoals());

            // actualizacion de las estadisiticas del equipo 2
            teamPlayer2.setPoints(teamPlayer2.getPoints() + 3);
            teamPlayer2.setGamesWon(teamPlayer2.getGamesWon() + 1);
            teamPlayer2.setGoalsScored(teamPlayer2.getGoalsScored() + teamPlayer2.getMatchGoals());
            teamPlayer2.setGoalsAgainst(teamPlayer2.getGoalsAgainst() + teamPlayer1.getMatchGoals());

            teamPlayer1.setMatchGoals(0);
            teamPlayer2.setMatchGoals(0);
            return teamPlayer1.getName() + " VS. " + teamPlayer2.getName() + " -> " + "Ganador: "
                    + teamPlayer2.getName();

        }
    }

    
    /** 
     * Metodo encargado de invocar al metodo playDay() y completar una jornada del campeonato de 3 posibles
     * @param dayRound controla el numero de fechas que se han jugado en el campeonato
     * @return String
     */
    public String playDay() {
        dayRound++;
        String roundState = "Ronda " + dayRound + "/3\n";
        if (dayRound < 4) {
            return roundState + "Ganadores de la fecha: " + "\n" + playMatch(team1, team2) + "\n" + playMatch(team1, team3) + "\n"
                    + playMatch(team2, team3);
        } else {
            return roundState + "Ya se han jugado todas las fechas del campeonato ";
        }
    }

    
    /** 
     * Ordena por medio del ordenamiento de burbuja los puntos de los equipos y por ende a los equipos para la conformacion de la tabla de posiciones
     * @return Team[]
     */
    public Team[] sortByPoints() {
        Team[] teamsSorted = new Team[3];
        teamsSorted[0] = team1;
        teamsSorted[1] = team2;
        teamsSorted[2] = team3;

        for (int x = 0; x < teamsSorted.length; x++) {
            for (int i = 0; i < teamsSorted.length - x - 1; i++) {
                if (teamsSorted[i].getPoints() < teamsSorted[i + 1].getPoints()) {
                    Team tmp = teamsSorted[i + 1];
                    teamsSorted[i + 1] = teamsSorted[i];
                    teamsSorted[i] = tmp;
                }
            }
        }
        return teamsSorted;
    }

    
    /** 
     * Metodo encargado de la creacion de la tabla de posiciones a partir de la invoacion del metodo sortByPoints()
     * @return String
     */
    public String makeLeaderBoard() {
        String leaderBoard = "";
        leaderBoard += "Clasificación general del campeonato: \n";
        leaderBoard += "Primer lugar: \n";
        leaderBoard += "\t" + sortByPoints()[0].getName() + "\n";
        leaderBoard += "\tPuntos: " + sortByPoints()[0].getPoints() + "\n";
        leaderBoard += "\tPartidos ganados/empatados/perdidos: " + sortByPoints()[0].getGamesWon() + "/"
                + sortByPoints()[0].getGamesTied() + "/" + sortByPoints()[0].getGamesLost() + "\n";
        leaderBoard += "\tGoles a favor/contra: " + sortByPoints()[0].getGoalsScored() + "/"
                + sortByPoints()[0].getGoalsAgainst() + "\n";
        leaderBoard += "\tDiferencia de gol: "
                + (sortByPoints()[0].getGoalsScored() - sortByPoints()[0].getGoalsAgainst()) + "\n\n";

        leaderBoard += "Segundo lugar: \n";
        leaderBoard += "\t" + sortByPoints()[1].getName() + "\n";
        leaderBoard += "\tPuntos: " + sortByPoints()[1].getPoints() + "\n";
        leaderBoard += "\tPartidos ganados/empatados/perdidos: " + sortByPoints()[1].getGamesWon() + "/"
                + sortByPoints()[1].getGamesTied() + "/" + sortByPoints()[1].getGamesLost() + "\n";
        leaderBoard += "\tGoles a favor/contra: " + sortByPoints()[1].getGoalsScored() + "/"
                + sortByPoints()[1].getGoalsAgainst() + "\n";
        leaderBoard += "\tDiferencia de gol: "
                + (sortByPoints()[1].getGoalsScored() - sortByPoints()[1].getGoalsAgainst()) + "\n\n";

        leaderBoard += "Tercer lugar: \n";
        leaderBoard += "\t" + sortByPoints()[2].getName() + "\n";
        leaderBoard += "\tPuntos: " + sortByPoints()[2].getPoints() + "\n";
        leaderBoard += "\tPartidos ganados/empatados/perdidos: " + sortByPoints()[2].getGamesWon() + "/"
                + sortByPoints()[2].getGamesTied() + "/" + sortByPoints()[2].getGamesLost() + "\n";
        leaderBoard += "\tGoles a favor/contra: " + sortByPoints()[2].getGoalsScored() + "/"
                + sortByPoints()[2].getGoalsAgainst() + "\n";
        leaderBoard += "\tDiferencia de gol: "
                + (sortByPoints()[2].getGoalsScored() - sortByPoints()[2].getGoalsAgainst()) + "\n\n";
        return leaderBoard;
    }
}