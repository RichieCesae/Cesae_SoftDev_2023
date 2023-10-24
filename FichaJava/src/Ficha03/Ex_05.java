package Ficha03;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int n, c;

        //ler num1
        System.out.print("Introduza o número de início: ");
        n = input.nextInt();

        //ler num1
        System.out.print("Introduza o último número: ");
        c = input.nextInt();

        while (n<=c){
            System.out.println(n);
            n++;
        }



    }

}
