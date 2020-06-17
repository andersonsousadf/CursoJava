/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
package E02_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaI, horaF, duracao;
        
        System.out.println("Digite a hora inicial do jogo:");
        horaI = sc.nextInt();
        System.out.println("Digite a hora final do jogo:");
        horaF = sc.nextInt();
        
        if (horaI < horaF)
            duracao = horaF - horaI;
        else
            duracao = 24 - horaI + horaF;
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
        sc.close();
    }
}
