package Ficha02;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        if (num1 % 2 == 0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é impar!");
        }

    }

}
