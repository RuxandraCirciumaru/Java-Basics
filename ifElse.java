
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //if/else- evalueaza conditii si bifurca codul in functie de rezultat

        System.out.println("pornim radio");
        //daca imi place piesa dam muzica mai tare

        boolean piesaFaina = false;
        if(piesaFaina == true){
            System.out.println("Dau muzica mai tare");
            System.out.println("Incep sa o fredonez");
        }

        System.out.println("oprim radio");


        int number = 2;

        if(number%2 == 0){
            System.out.println("Numarul este par");
        }else {
            System.out.println("Numarul este impar");
        }

        //cum luam date de la tastatura in java
        //if-else if - else

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti ora:");
        int ora = sc.nextInt();
        
        if (ora < 0 ){
            System.out.println("Introduceti o ora valida");
        } else if (ora <= 11) {
            System.out.println("Buna dimineata");
            
        } else if (ora <= 18) {
            System.out.println("Buna ziua");
            
        }else if (ora <= 22) {
            System.out.println("Buna seara");
        }else if (ora <= 24) {
            System.out.println("Noapte buna");
        } else {
            System.out.println("introduceti o ora in intervalul 0 - 24");
        }

        //switch - cand stim deja valorile
        //Robotel telefonic

        Scanner cititor = new Scanner(System.in);
        System.out.println("Alege optiunea");
        int optiune = cititor.nextInt();

        switch (optiune){
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("Ro");
                break;
            case 2:
                System.out.println("Eng");
                break;
            default:
                System.out.println("Alegeti o optiune valida");
        }


    }
}
