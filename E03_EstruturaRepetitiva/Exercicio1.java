/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/
package E03_EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        
        int teste;
        System.out.println("Digite a senha:");
        teste = sc.nextInt();
        
        while (teste != senha){
            System.out.println("Senha Inválida!");
            System.out.println("Digite novamente:");
            teste = sc.nextInt();
            
        }
        System.out.println("ACESSO PERMITIDO.");
       
        sc.close();
    }
 
}
