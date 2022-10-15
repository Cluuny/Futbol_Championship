package view;

import java.util.Scanner;

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
     * Imprime un mensaje y recoge una serie de datos de tipo String
     * 
     * @param dataMessage
     * @return String
     */
    public String collecData(String dataMessage) {
        System.out.println(dataMessage);
        return sc.nextLine();
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
