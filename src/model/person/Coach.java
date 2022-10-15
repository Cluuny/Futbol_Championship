package model.person;

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
