package Ficha02;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();


        System.out.print("Introduza o sinal da operação aritmética (+,-,*,/): ");
        String opcao;
        opcao = input.next();
        switch (opcao){
            case "+":
                System.out.println("Resultado :" + num1 + num2);
                break;

            case "-":
                System.out.println("Resultado :" + (num1-num2));
                break;

            case "*":
                System.out.println("Resultado :" + num1*num2);
                break;

            case "/":
                System.out.println("Resultado :" + num1/num2);
                break;
            default:
                System.out.println("Erro!");

        }

    }

}
