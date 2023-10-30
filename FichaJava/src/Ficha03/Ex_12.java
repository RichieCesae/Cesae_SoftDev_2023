package Ficha03;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Insira o inicio: ");
        inicio = input.nextInt();

        System.out.print("Insira o fim: ");
        fim = input.nextInt();

        while (inicio < fim) {
            inicio = inicio + 1;
            if ((inicio % 5) == 0) {
                System.out.println(inicio);
            }
        }

    }
=======
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

>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
}
