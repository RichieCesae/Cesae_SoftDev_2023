package Ficha01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        //instanciar o scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2, soma, sub, div, mult;

        //ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();

        //ler num2
        System.out.print("Introduza outro número: ");
        num2 = input.nextDouble();

        //calcular a soma de num1 + num2
        soma = num1+num2;

        //calcular subtração
        sub = num1-num2;

        //calcular multiplicação
        mult = num1*num2;

        //calcular divisao
        div = num1/num2;

        // apresentar resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + mult);
        System.out.println("Divisao: " + div);

    }

}
