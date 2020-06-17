/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
package E01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num, horas;
        double valHora, salario;
        
        System.out.println("Digite o numero e o numero de horas:");
        num = sc.nextInt();
        horas = sc.nextInt();
        System.out.println("Digite o valor da hora aula:");
        valHora = sc.nextDouble();
        
        salario = horas * valHora;
        
        System.out.printf("NUMBER: %d%nSALARY: U$ %.2f%n", num, salario);
        
        sc.close();
    }
}
