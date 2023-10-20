package Ficha01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double prod1, prod2, prod3, preco;

        //ler primeiro preço
        System.out.print("Introduza um número: ");
        prod1 = input.nextDouble();

        //ler segundo preço
        System.out.print("Introduza um número: ");
        prod2 = input.nextDouble();

        //ler terceiro preço
        System.out.print("Introduza um número: ");
        prod3 = input.nextDouble();

        //Calcular preço final
        preco = 0.9*prod1 + 0.9*prod2 + 0.9*prod3;

        // apresentar preço final
        System.out.println("Aplicado o desconto de 10% irá pagar: " + preco);

    }

}
