package Ficha01;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {


        double Salariol, Salariob, Venc=40, SubAl=5, IRS=0.1, SegSoc=0.11, IVA=0.2375;
        int Dias, cod;

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //ler codigo de trabalhador
        System.out.print("Digite o seu código:");
        cod = input.nextInt();

        //ler dias de trabalho
        System.out.print("Quantos dias trabalhou?   R:");
        Dias = input.nextInt();

        Salariob = Dias*(Venc + SubAl);

        Salariol= Salariob - Venc*(Dias*IRS+ Dias*SegSoc+ Dias*IVA);

        //a
        System.out.println("O salário bruto do funcionário fruto do vencimento será: " + (Salariob - Dias*SubAl));

        //b
        System.out.println("O total de subsidio de alimentação será será: " + (Salariob - Dias*Venc));

        //c
        System.out.println("O valor da retenção de IRS será: " + Dias*Venc*IRS);

        //d
        System.out.println("O total a entregar à segurança social será: " + (Dias*Venc*IVA + Dias*Venc*SegSoc));

        //e
        System.out.println("O funcionário levará para casa: " + Salariol);

    }

}
