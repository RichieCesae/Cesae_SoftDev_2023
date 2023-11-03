package Ficha02;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2, num3, med;

        //ler num1
        System.out.print("Introduza a primeira nota (0-20): ");
        num1 = input.nextDouble();

        //ler num2
        System.out.print("Introduza a segunda nota (0-20): ");
        num2 = input.nextDouble();

        //ler num3
        System.out.print("Introduza a terceira nota (0-20): ");
        num3 = input.nextDouble();

        med = 0.25*num1 + 0.35*num2 + 0.4*num3;

        System.out.println("A sua média é " + med);

        if (med > 9.5 && med <= 20){
            System.out.println("Está aprovado!");
        } else if (med <= 9.5) {
            System.out.println("Não está aprovado!");
        }else{
            System.out.println("Não inseriu notas validas");
        }


    }

}
