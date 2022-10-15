package presenter;

import view.*;
import model.*;

public class Presenter {
    private String menuMessage = "Bienvenido, porfavor ingrese el numero asociado a la opcion que desea esocger: " +
            "\n1. Gestionar equipos de Fútbol" +
            "\n2. Gestionar campeonato" +
            "\n3. Salir";
    View view;
    Logic logic;

    Presenter() {
        view = new View();
        logic = new Logic();
    }

    public void run() {
        int option = view.ShowMenu(menuMessage);
        if (option == 1) {
            teamOptions(view.ShowMenu(
                    "selecciona una opción " +
                            "\n1. Crear un Equipo de futbol" +
                            "\n2. Eliminar un equipo de futbol" +
                            "\n3. Ver mis equipos de futbol"));
        } else if (option == 2) {
            championshipOptions(view.ShowMenu(
                    "selecciona una opción " +
                            "\n1. ver tabla de posiciones" +
                            "\n2. jugar proximo partido" +
                            "\n3. Atras"));
        } else {
            view.print("Saliendo...");
            System.exit(0);
        }
    }

    public void teamOptions(int optionTeam) {
        switch (optionTeam) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                view.print("Error, porfavor vuelva a intentarlo.");
                break;
        }
    }

    public void championshipOptions(int optionChampion) {
        switch (optionChampion) {
            case 1:
                // ver tabla de posiciones
                break;
            case 2:
                // jugar proximo partido
                break;
            case 3:
                // atras
                break;
            default:
                view.print("Error, porfavor vuelva a intentarlo.");
                break;
        }
    }

    public static void main(String[] args) {
        new Presenter().run();
    }
}
