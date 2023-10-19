package Ficha01;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1, num2, soma;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        //calcular a soma de num1 + num2
        soma = num1+num2;

        // apresentar a soma
        System.out.println("Soma: " + soma);

    }

}
