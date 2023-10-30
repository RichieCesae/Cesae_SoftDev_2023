package Ficha03;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
<<<<<<< HEAD
        int n, m, c= 0;

        //ler num1
        System.out.print("Introduza um limite: ");
        n = input.nextInt();

        //ler num1
        System.out.print("Introduza um salto: ");
        m = input.nextInt();

        while (c<=n){
            System.out.println(c);
            c= c+m;
        }


=======
        int limite, salto, c=0;

        //ler num1
        System.out.print("Introduza um limite: ");
        limite = input.nextInt();

        System.out.print("Introduza um salto: ");
        salto = input.nextInt();

        while (c<=limite-salto){
            System.out.println(c);
            c=c+salto;
        }
        System.out.println(c);
>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e

    }

}
