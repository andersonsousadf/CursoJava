/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si.
Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/
package E02_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite dois numeros:");
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (a % b == 0 || b % a == 0){
            System.out.println("Multiplos");
        } else
            System.out.println("Não são mutiplos");
        
        sc.close();
    }
}
