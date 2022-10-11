package presenter;

import view.*;
import model.*;

public class Presenter {
    private String menuMessage = "Bienvenido, porfavor ingrese el numero asociado a la opcion que desea esocger: \n1. Listar Equipo de Futbol \n2. Salir";
    View view;
    Logic logic;
    Presenter(){
        view = new View();
        logic = new Logic();
    }
    public void run(){
        int option = view.ShowMenu(menuMessage);
        if (option == 1) {
            chooseTeam(view.ShowMenu("selecciona el equipo del cual quieres ver las estadisticas: \n1. Equipo 1 \n2. Equipo 2."));
        }
        else{
            view.print("Saliendo...");
            System.exit(0);
        }
    }
    public void chooseTeam(int optionTeam){
        switch (optionTeam) {
            case 1:
                //equipo 1
                break;
            case 2:
                //equipo 2
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
