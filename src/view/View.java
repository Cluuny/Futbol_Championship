package view;

import java.util.Scanner;

/**
 * Clase View la cual esta encargada de la comunicacion con el usuario y hace
 * las veces de interfaz grafica
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    /**
     * Imprime un menú y recoge una opción numerica
     * 
     * @param menuMessage
     * @return int
     */
    public int ShowMenu(String menuMessage) {
        System.out.println(menuMessage);
        return sc.nextInt();
    }

    /**
     * Imprime un mensaje y no recoge ni retorna nada
     * 
     * @param printMessage
     */
    public void print(String printMessage) {
        System.out.println(printMessage);
    }
}
