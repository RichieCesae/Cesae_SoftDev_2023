package Ficha03;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int n, c=0;

        //ler num1
        System.out.print("Introduza um número de inicio: ");
        n = input.nextInt();

        while (c<=n){
            System.out.println(c);
            c=c+2;
        }


    }
}
