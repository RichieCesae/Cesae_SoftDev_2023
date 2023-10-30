package Ficha02;

import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int SaldoM;

        //ler Saldo
        System.out.print("Introduza o seu saldo médio anual: ");
        SaldoM = input.nextInt();

        if (SaldoM > 0 && SaldoM <= 2000){
            System.out.print("O seu saldo médio é " + SaldoM + "€ e não tem direito a crédito especial");
        } else if (SaldoM > 2000 && SaldoM <=4000) {
            System.out.print("O seu saldo médio é " + SaldoM + "€ e o seu crédito especial será " + SaldoM*0.2 + "€");
        }else if (SaldoM > 4000 && SaldoM <=6000) {
            System.out.print("O seu saldo médio é " + SaldoM + "€ e o seu crédito especial será " + SaldoM*0.3 + "€");
        }else if (SaldoM > 6000) {
            System.out.print("O seu saldo médio é " + SaldoM + "€ e o seu crédito especial será " + SaldoM*0.4 + "€");
        }

    }

}



