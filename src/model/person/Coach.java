package model.person;

/**
 * Clase Coach para la instanciación de objetos de tipo Coach
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */
public class Coach extends Person {
    private int yearExperience;
    private boolean foreignNationality;

    public Coach(String name, String lastName, int age, int yearExperience, boolean foreignNationality) {
        super(name, lastName, age);
        this.yearExperience = yearExperience;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public boolean isForeignNationality() {
        return foreignNationality;
    }
}
