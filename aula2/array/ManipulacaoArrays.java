package array;
public class ManipulacaoArrays {
    public static void main(String[] args) {
        // Cria uma array de inteiros com tamanho 5
        int[] numeros = { 10, 20, 30, 40, 50 };

        // Imprime o valor do primeiro elemento da array
        System.out.println("Primeiro elemento: " + numeros[0]);
        
        // Altera o valor do terceiro elemento da array
        numeros[2] = 35;

        // Acessando o último elemento do array
        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println("Último elemento do array: " + ultimoElemento);

        // Imprime todos os elementos da array usando um loop for
        System.out.println("Elementos da array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Calcula e imprime a soma dos elementos da array
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma dos elementos: " + soma);
    }
}
