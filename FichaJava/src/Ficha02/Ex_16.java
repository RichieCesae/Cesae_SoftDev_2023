package Ficha02;

import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1, notas, resto;


        //ler num1
        System.out.print("Introduza um número multiplo de 5: ");
        num1 = input.nextInt();


            notas = num1 / 200;
            System.out.println("Serão necessárias " + notas + " notas de 200€.");
            resto = num1 % 200;

            notas = resto / 100;
            System.out.println("Serão necessárias " + notas + " notas de 100€.");
            resto = (num1 % 200) %100;

            notas = resto / 50;
            System.out.println("Serão necessárias " + notas + " notas de 50€.");
            resto = ((num1 % 200) %100) %50;

            notas = resto / 20;
            System.out.println("Serão necessárias " + notas + " notas de 20€.");
            resto = (((num1 % 200) %100) %50) % 20;

            notas = resto / 10;
            System.out.println("Serão necessárias " + notas + " notas de 10€.");
            resto = ((((num1 % 200) %100) %50) % 20) % 10;

            notas = resto / 5;
            System.out.println("Serão necessárias " + notas + " notas de 5€.");


    }

}
