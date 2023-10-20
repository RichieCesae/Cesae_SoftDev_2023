package Ficha01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        int hh, mm, ss, soma, resto;

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //ler minutos da primeira musica
        System.out.print("Introduza minutos da musica 1: ");
        mm = input.nextInt();

        soma = mm * 60;

        //ler segundos da primeira musica
        System.out.print("Introduza segundos da musica 1: ");
        ss = input.nextInt();

        soma = soma + ss;

        //ler minutos da segunda musica
        System.out.print("Introduza minutos da musica 2: ");
        mm = input.nextInt();

        soma = soma + (mm * 60);

        //ler segundos da segunda musica
        System.out.print("Introduza segundos da musica 2: ");
        ss = input.nextInt();

        soma = soma + ss;

        //ler minutos da teceira musica
        System.out.print("Introduza minutos da musica 3: ");
        mm = input.nextInt();

        soma = soma + (mm * 60);

        //ler segundos da terceira musica
        System.out.print("Introduza segundos da musica 3: ");
        ss = input.nextInt();

        soma = soma + ss;


        hh = soma / 3600;
        resto = soma % 3600;

        mm = resto /60;

        ss = soma - (hh*3600 + mm*60);



        // apresentar a soma
        System.out.println("tempo de album: " + hh + "h:" + mm + "m:" + ss + "s");



    }

}
