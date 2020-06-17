/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido 
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código 
(até que seja válido).
O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.*/
package E03_EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo;
        System.out.printf("Digite o tipo:%n1- Alcool%n2- Gasolina%n3- Diesel%n4- Fim%n");
        tipo = sc.nextInt();
        
        while (tipo != 4){
            if (tipo == 1){
                alcool += 1;
            } else if (tipo == 2){
                gasolina += 1;
            } else if (tipo == 3){
                diesel += 1;
            }
            System.out.println("Digite outro tipo:");
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}
