
package E02_EstruturaCondicional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um numero:");
        num = sc.nextInt();
        
        if (num >= 0)
            System.out.println("NÃO NEGATIVO");
        else
            System.out.println("NEGATIVO");
        
        sc.close();
    }
}
