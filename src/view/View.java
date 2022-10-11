package view;

import java.util.Scanner;

public class View {
    private int option;
    private Scanner sc;
    public View(){
        sc = new Scanner(System.in);
    }
    public int ShowMenu(String message){
        System.out.println(message);
        option = sc.nextInt();
        return option;
    }
    public void print(String printMessage){
        System.out.println(printMessage);
    }
}
