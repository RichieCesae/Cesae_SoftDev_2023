package FichaExtra01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int n=44, i=1;


        if (i>0){
            System.out.print("Adivinhe o número (1 a 100): ");
            i = input.nextInt();
            if (i<44 && i>0){
                System.out.println("Muito Baixo.");
            }else if (i>44 && i<=100){
                System.out.println("Muito Alto.");
            }else{
                System.out.println("Boa! Ganhaste o jogo!");
            }
        }


        if (i>0){
            System.out.print("Adivinhe o número (1 a 100): ");
            i = input.nextInt();
            if (i<44 && i>0){
                System.out.println("Ficaste sem tentativas.");
            }else if (i>44 && i<=100){
                System.out.println("Ficaste sem tentativas.");
            }else{
                System.out.println("Boa! Ganhaste o jogo!");
            }
        }


    }

}
