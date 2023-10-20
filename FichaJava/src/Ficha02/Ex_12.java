package Ficha02;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        System.out.println("SELECIONE UMA DAS OPÇÕES");
        System.out.println("1.Criar | 2.Atualizar | 3.Eliminar | 4.Sair");

        String opcao;
        opcao = input.next();
        switch (opcao) {
            case "1":
                System.out.println("1.Criar");
                break;

            case "2":
                System.out.println("2.Atualizar");
                break;

            case "3":
                System.out.println("3.Eliminar");
                break;

            case "4":
                System.out.print("");
                break;
            default:
                System.out.println("Não introduziu um valor válido.");

        }
    }
}
