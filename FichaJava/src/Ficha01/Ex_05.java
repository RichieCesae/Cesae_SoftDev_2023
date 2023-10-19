package Ficha01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2, num3, soma, media;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        //ler num3
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        //calcular a media
        soma = num1+num2+num3;
        media = soma/3;

        // apresentar a media
        System.out.println("Media dos numeros escolhidos: " + media);

        //apresentar media ponderada 20%
        


    }

}
