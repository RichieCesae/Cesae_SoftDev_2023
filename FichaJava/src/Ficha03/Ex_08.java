package Ficha03;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner input = new Scanner(System.in);

        int media, num, total;
        media = 0;
        total = -1;
        num = 0;

        while (num != -1){
            media = num + media;
            System.out.print("insira um numero: ");
            num = input.nextInt();
            total = total + 1;

        }
        media = media / total;
        System.out.println("Media: " + media);
    }

}

=======
        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double n=0,somador=1,c=0;


        while (n!=-1){
            System.out.print("Introduza um número: ");
            n = input.nextDouble();

            somador=somador+n;
            c++;
        }
        System.out.println("Média: " + somador/(c-1));

    }

}
>>>>>>> 648953c139851fdf65fc90094d88f010dfa4ef6e
