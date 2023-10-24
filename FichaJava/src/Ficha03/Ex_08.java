package Ficha03;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double n=0,somador=1,c=0;


        while (n!=-1){
            System.out.print("Introduza um número: ");
            n = input.nextDouble();

            somador=somador+n;
            c++;
        }
        System.out.println("Média: " + somador/(c-1));

    }

}
