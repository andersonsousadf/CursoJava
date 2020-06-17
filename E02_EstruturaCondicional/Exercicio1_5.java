/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
CODIGO ESPECIFICAÇÃO      PREÇO
1      Cachorro-Quente    R$4.00
2      X-Salada           R$4.50
3      X-Bacon            R$5.00
4      Torrada Simples    R$2.00
5      Refrigerante       R$1.50
*/
package E02_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, quantidade;
        double valor;
        System.out.println("Digite o código do produto e a quantidade:");
        cod = sc.nextInt();
        quantidade = sc.nextInt();

        if (cod == 1) {
            valor = quantidade * 4.00;
            System.out.printf("R$ %.2f%n", valor);
        } else if (cod == 2) {
            valor = quantidade * 4.50;
            System.out.printf("R$ %.2f%n", valor);
        } else if (cod == 3) {
            valor = quantidade * 5.00;
            System.out.printf("R$ %.2f%n", valor);
        } else if (cod == 4) {
            valor = quantidade * 2.00;
            System.out.printf("R$ %.2f%n", valor);
        } else {
            valor = quantidade * 1.50;
            System.out.printf("R$ %.2f%n", valor);
        }
        sc.close();
    }
}
