package FichaExtra01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma letra do alfabeto: ");

        String opcao;
        opcao = input.next();
        switch (opcao) {
            case "a":
                System.out.println("Vogal");
                break;
            case "e":
                System.out.println("Vogal");
                break;
            case "i":
                System.out.println("Vogal");
                break;
            case "o":
                System.out.println("Vogal");
                break;
            case "u":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");

        }
    }

}
