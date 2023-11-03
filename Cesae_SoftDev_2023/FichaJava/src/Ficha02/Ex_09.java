package Ficha02;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {


        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1, num2, num3;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        //ler num3
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1<num3){
            System.out.println("O menor dos três é o " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor dos três é o " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("O menor dos três é o " + num3);
        }

    }

}
