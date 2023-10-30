package Ficha03;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
<<<<<<< HEAD
        int n, m=0;
=======
        int n, c=0;
>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e

        //ler num1
        System.out.print("Introduza um número: ");
        n = input.nextInt();

<<<<<<< HEAD
        m= n+5;
        n= n-5;

        while (n<=m){
            System.out.println(n);
            n++;
        }

=======
        while (c<10){
            System.out.println(n-5);
            n++;
            c++;
        }


>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
    }

}
