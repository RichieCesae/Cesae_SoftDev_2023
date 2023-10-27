package Ficha03;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int n, m;

        //ler num1
        System.out.print("Introduza um número de inicio: ");
        n = input.nextInt();

        //ler num1
        System.out.print("Introduza um número de fim: ");
        m = input.nextInt();

        while(n<=m){
            System.out.println(n);
            n++;
        }

    }

}
