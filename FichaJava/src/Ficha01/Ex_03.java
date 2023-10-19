package Ficha01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double comp, larg, area, perimetro;

        //ler comprimento
        System.out.print("Introduza o comprimento do retangulo: ");
        comp = input.nextDouble();

        //ler largura
        System.out.print("Introduza a largura do retangulo: ");
        larg = input.nextDouble();

        //calcular a area
        area = comp*larg;

        //calcular o perimetro
        perimetro = 2*comp + 2*larg;

        // apresentar area e perimetro
        System.out.println("Area do retangulo: " + area);
        System.out.println("Perimetro do retangulo: " + perimetro);

    }

}
