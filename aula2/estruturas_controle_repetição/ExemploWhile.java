package estruturas_controle_repetição;

public class ExemploWhile {
  
  public static void main(String[] args) {
    
    int contador = 1; // Inicialização do contador

    while (contador <= 5) { // Condição de parada do loop
        System.out.println("Contador: " + contador); // Imprime o valor do contador
        contador++; // Incrementa o contador em 1
    }

    System.out.println("Fim do loop while"); // Mensagem após o fim do loop
    
  }
}
