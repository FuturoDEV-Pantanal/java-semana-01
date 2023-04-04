package tiposDados;

public class DataTypesAndVariables {
  
    public static void main(String[] args) {
      
      // Declarando e inicializando variáveis de diferentes tipos de dados
      int idade = 25;
      double altura = 1.8;
      boolean ehEstudante = true;
      String nome = "Pedro";
      
      // Imprimindo as variáveis no console
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Altura: " + altura);
      System.out.println("É estudante: " + ehEstudante);
      
      // Usando operadores aritméticos com tipos de dados numéricos
      int num1 = 10;
      int num2 = 5;
      int soma = num1 + num2;
      int diferenca = num1 - num2;
      int produto = num1 * num2;
      double quociente = (double) num1 / num2; // Convertendo para double para obter quociente decimal
      
      // Imprimindo os resultados das operações aritméticas
      System.out.println("Soma: " + soma);
      System.out.println("Diferença: " + diferenca);
      System.out.println("Produto: " + produto);
      System.out.println("Quociente: " + quociente);
      
      // Usando o operador de concatenação (+) com o tipo de dados String
      String saudacao = "Olá, " + nome + "!";
      System.out.println(saudacao);
    }
  }
