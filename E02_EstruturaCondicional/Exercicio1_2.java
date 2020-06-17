//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package E02_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero:");
        num = sc.nextInt();
        int resto = num%2;
        
        if (resto == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        sc.close();
    }
}
