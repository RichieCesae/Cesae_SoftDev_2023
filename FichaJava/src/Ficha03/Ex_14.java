package Ficha03;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int x, ft=1,c=1;

        System.out.print("Introduza um número: ");
        x = input.nextInt();

        while (c<=x){
            ft = ft*c;
            c++;
        }
        System.out.println("Fatorial: " + ft);

    }

}
