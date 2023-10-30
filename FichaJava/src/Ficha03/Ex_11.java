package Ficha03;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
<<<<<<< HEAD
        int n=1,a=0,b=0,c= 0,d=0;

        while (n>0){

            System.out.print("Introduza um numero: ");
            n = input.nextInt();

            if (n>=0 && n<=25){
                a++;
            } else if (n>=26 && n<=50) {
                b++;
            }else if (n>=51 && n<=75) {
                c++;
            }else if (n>=76 && n<=100) {
                d++;
            }

        }
=======
        int n=1,a=0,b=0,c=0,d=0;


        while (n>0){

            System.out.print("Introduza um número: ");
            n = input.nextInt();

            if (n>=0 && n<=25){
                a=a+1;
            } else if (n>=26 && n<=50) {
                b=b+1;
            } else if (n>=51 && n<=75) {
                c=c+1;
            } else if (n>=76 && n<=100) {
                d=d+1;
            }
        }

>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
        System.out.println("[00,25]: " + a);
        System.out.println("[26,50]: " + b);
        System.out.println("[51,75]: " + c);
        System.out.println("[76,100]: " + d);

<<<<<<< HEAD

=======
>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
    }

}
