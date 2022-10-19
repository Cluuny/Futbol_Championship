package model.person;

/**
 * Clase abstracta Person para la creacion de la bse de todos los integrantes del equipo de futbol
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */
public abstract class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
