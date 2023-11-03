package Ficha02;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        double sal;

        //ler salario
        System.out.print("Introduza um salário: ");
        sal = input.nextDouble();

        if (sal < 15000){
            System.out.println("Paga taxa de 20% : " + sal*0.2 + "€");
        } else if (sal >= 15000 && sal < 20000) {
            System.out.println("Paga taxa de 30% : " + sal*0.3 + "€");
        } else if (sal >= 20000 && sal < 25000) {
            System.out.println("Paga taxa de 35% : " + sal*0.35 + "€");
        }else{
            System.out.println("Paga taxa de 40% : " + sal*0.4 + "€");
        }

    }

}
