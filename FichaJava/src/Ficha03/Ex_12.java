package Ficha03;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int x, y;

        System.out.print("Introduza o menor número: ");
        x = input.nextInt();

        System.out.print("Introduza o maior número: ");
        y = input.nextInt();

        while(x<=y){
            if (x%5 == 0){
                System.out.println(x);
            }x++;
        }

    }

}
