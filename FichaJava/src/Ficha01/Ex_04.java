package Ficha01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double raio, area;

        //ler raio
        System.out.print("Introduza o raio da circunferencia: ");
        raio = input.nextDouble();

        //calcular area do circulo
        area = Math.PI*raio*raio;

        // apresentar a area do circulo
        System.out.println("Area do circulo: " + area);

    }

}
