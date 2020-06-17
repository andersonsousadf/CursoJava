/*Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
package E01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, diferenca;
        System.out.println("Digite 4 numeros:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        
        diferenca = a*b-c*d;
        
        System.out.println("Diferença = " + diferenca);
        
        sc.close();
    }
}
