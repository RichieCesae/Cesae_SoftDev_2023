package Ficha02;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int lugar;

        //ler salario
        System.out.print("Introduza o seu lugar na corrida: ");
        lugar = input.nextInt();

        if (lugar == 1){
            System.out.println("Ganhou 10 pontos!");
        } else if (lugar ==2) {
            System.out.println("Ganhou 8 pontos!");
        }else if (lugar ==3) {
            System.out.println("Ganhou 6 pontos!");
        }else if (lugar ==4) {
            System.out.println("Ganhou 5 pontos!");
        }else if (lugar ==5) {
            System.out.println("Ganhou 4 pontos!");
        }else if (lugar ==6) {
            System.out.println("Ganhou 3 pontos!");
        }else if (lugar ==7) {
            System.out.println("Ganhou 2 pontos!");
        }else if (lugar ==8) {
            System.out.println("Ganhou 1 pontos!");
        }else{
            System.out.println("Não ganhou pontos.");
        }

    }

}
