package Ficha03;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int n, c=0;

        //ler num1
        System.out.print("Introduza um número: ");
        n = input.nextInt();

        while (c<10){
            System.out.println(n-5);
            n++;
            c++;
        }


    }

}
