/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
Calcule e mostre o valor a ser pago.*/
package E01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int cod, num, cod2, num2;
        double valor1, valor2, calculo;
        
        System.out.println("Digite o código, quantidade e valor da peça 1:");
        cod = sc.nextInt();
        num = sc.nextInt();
        valor1 = sc.nextDouble();
        
        System.out.println("Digite o código, quantidade e valor da peça 2:");
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();
        
        calculo = (num * valor1) + (num2 * valor2);
        System.out.printf("------------------------------------%n");
        System.out.printf("VALOR A PAGAR: U$ %.2f%n", calculo);
        System.out.printf("------------------------------------%n");
        sc.close();
    }
}
