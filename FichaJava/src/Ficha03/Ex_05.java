package Ficha03;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
<<<<<<< HEAD
        int n, m;

        //ler num1
        System.out.print("Introduza um número de inicio: ");
        n = input.nextInt();

        //ler num1
        System.out.print("Introduza um número de fim: ");
        m = input.nextInt();

        while(n<=m){
=======
        int n, c;

        //ler num1
        System.out.print("Introduza o número de início: ");
        n = input.nextInt();

        //ler num1
        System.out.print("Introduza o último número: ");
        c = input.nextInt();

        while (n<=c){
>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
            System.out.println(n);
            n++;
        }

<<<<<<< HEAD
=======


>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
    }

}
