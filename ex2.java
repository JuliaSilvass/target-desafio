/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;*/

import java.util.Scanner;

public class ex1{
    public static void main (String [] args){
        //Criando um objeto scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);
        int n, f1 = 0, f2 = 1, f3 = 0;

        //Interação com usuário
        System.out.println("Insira um número para saber se pertence a sequência de Fibonacci: ");
        n = scanner.nextInt();
        
        if (n < 0){
            System.out.println("O número não pertence a sequência de Fibonacci.");
            return;
        } else if (n == f1) {
            System.out.println("O número pertence a sequência de Fibonacci.");
            return;
        }

        for (int i = 0; i < n; i++){
            f1 = f2 + f3;
            if (f1 == n){
                System.out.println("O número pertence a sequência de Fibonacci.");
                return;
            }
            f2 = f3;
            f3 = f1;
        }  

        System.out.println("O número não pertence a sequência de Fibonacci.");
        return;
    }
}
