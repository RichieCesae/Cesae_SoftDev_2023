package Ficha02;

import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1, num2, num3;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        //ler num3
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();


        System.out.print("Pretende os números por ordem crescente (C), ou decrescente (D) ?");
        String opcao;
        opcao = input.next();
        switch (opcao) {
            case "C":
                if (num1 < num2 && num2 < num3) {
                    System.out.println(num1 + "<" + num2 + "<" + num3);
                } else if (num2 < num1 && num1 < num3) {
                    System.out.println(num2 + "<" + num1 + "<" + num3);
                } else if (num3 < num1 && num1 < num2) {
                    System.out.println(num3 + "<" + num1 + "<" + num2);
                } else if (num3 < num2 && num2 < num1) {
                    System.out.println(num3 + "<" + num2 + "<" + num1);
                } else if (num2 < num3 && num3 < num1) {
                    System.out.println(num2 + "<" + num3 + "<" + num1);
                } else if (num1 < num3 && num3 < num2) {
                    System.out.println(num1 + "<" + num3 + "<" + num2);
                }
                break;

            case "D":
                if (num1 > num2 && num2 > num3) {
                    System.out.println(num1 + ">" + num2 + ">" + num3);
                } else if (num2 > num1 && num1 > num3) {
                    System.out.println(num2 + ">" + num1 + ">" + num3);
                } else if (num3 > num1 && num1 > num2) {
                    System.out.println(num3 + ">" + num1 + ">" + num2);
                } else if (num3 > num2 && num2 > num1) {
                    System.out.println(num3 + ">" + num2 + ">" + num1);
                } else if (num2 > num3 && num3 > num1) {
                    System.out.println(num2 + ">" + num3 + ">" + num1);
                } else if (num1 > num3 && num3 > num2) {
                    System.out.println(num1 + ">" + num3 + ">" + num2);
                }
                break;

            default:
                System.out.println("Erro!");

        }

    }
}
