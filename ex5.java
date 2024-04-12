/*5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;*/

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // Criando um objeto scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);
        String entrada, saida;

        // Interação com usuário
        System.out.println("Digite uma string para inverter: ");
        entrada = scanner.nextLine();

        // Chamando a função para inverter a string
        saida = inverterString(entrada);

        // Exibindo a string invertida
        System.out.println("String invertida: " + saida);
    }

    // Função para inverter a string
    public static String inverterString(String str) {
        // Convertendo a string em um array de caracteres
        char[] caracteres = str.toCharArray();

        // Invertendo o array
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        // Convertendo o array de volta para uma string
        return new String(caracteres);
    }
}

