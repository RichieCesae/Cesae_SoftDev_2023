package Ficha03;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int n,c=0,m=0,r=0,t=0;

        System.out.print("Quantos numeros deseja inserir: ");
        n = input.nextInt();

        while(c<n){
            System.out.print("Introduza um número: ");
            m = input.nextInt();
            if (m>r){
                r = m + r;
                m = r - m;
                r = r - m;
            }else{
                t=t+1;
            }
            c++;

        }
        if (t>0){
            System.out.println("Não crescente.");
        }else{
            System.out.println("Crescente.");
        }

    }

}
