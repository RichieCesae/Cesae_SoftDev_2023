package Ficha02;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int hh, mm;

        //ler horas
        System.out.print("Introduza horas: ");
        hh = input.nextInt();

        //ler minutos
        System.out.print("Introduza minutos: ");
        mm = input.nextInt();

        if (hh <= 24 && hh > 12){
            System.out.println((hh-12) + ":" + mm +"AM");
        }else if(hh > 12){
            System.out.println(hh + ":" + mm + "PM");
        }else if (hh == 12){
            System.out.println((hh-12) + ":" + mm + "PM");
        }

    }

}
