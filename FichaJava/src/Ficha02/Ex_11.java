package Ficha02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double saldo, mon;

        //ler saldo
        System.out.print("Introduza o seu saldo: ");
        saldo = input.nextInt();

        //ler montante
        System.out.print("Introduza o montante que quer debitar/creditar: ");
        mon = input.nextInt();

        System.out.println("Pretende Creditar ou Debitar?");

        String opcao;
        opcao = input.next();
        switch (opcao){
            case "Creditar":
                System.out.println("Novo saldo da conta: " + (saldo+mon) + "€");
                break;

            case "Debitar":
                if (mon > saldo){
                    System.out.println("Impossivél levantar esse montante.");
                }else{
                    System.out.println("Novo saldo da conta: " + (saldo-mon) +"€");
                }break;
            default:
                System.out.println("Erro!");
                }


    }

}
