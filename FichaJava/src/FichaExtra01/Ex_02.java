package FichaExtra01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int peso;

        System.out.print("Introduza o seu peso: ");
        peso = input.nextInt();

        if (peso<0){
            System.out.println("Peso inválido");
        }else{
            System.out.println("Peso na lua: " + 0.16*peso);
        }


    }

}
