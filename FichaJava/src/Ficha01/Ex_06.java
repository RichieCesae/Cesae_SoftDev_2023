package Ficha01;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int valor1, valor2;

        //ler valor1
        System.out.print("Introduza um número para a: ");
        valor1 = input.nextInt();

        //ler valor2
        System.out.print("Introduza um número para b: ");
        valor2 = input.nextInt();

        // apresentar valores
        System.out.println("Valor de a =" + valor1);
        System.out.println("Valor de b =" + valor2);

        //permutar valores
        if(valor1 >valor2){

            valor1 = valor1 ^ valor2;
            valor2 = valor1 ^ valor2;
            valor1 = valor1 ^ valor2;
        }

        // apresentar valores
        System.out.println("Novo a =" + valor1);
        System.out.println("Novo b =" + valor2);






    }

}
