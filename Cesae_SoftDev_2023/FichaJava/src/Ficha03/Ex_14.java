package Ficha03;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner input = new Scanner(System.in);

        int num1, num2 = 0, num3 = 0, num4 = 0;

        System.out.print("Escolha um número positivo: ");
        num1 = input.nextInt();
        num4 = num1;
        num3 = num1;

        while (num2 < num4) {
            if (num3 > 1) {
                num3 = num3 - 1;
                num1 = num1 * num3;
            }
            num2++;
        }
        System.out.println(num1);
=======
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
>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e

    }

}
