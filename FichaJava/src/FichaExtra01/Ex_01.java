package FichaExtra01;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int idd;

        System.out.print("Introduza a sua idade: ");
        idd = input.nextInt();

        if (idd>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

    }

}
