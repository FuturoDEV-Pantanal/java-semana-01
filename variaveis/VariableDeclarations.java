package variaveis;
public class VariableDeclarations {
  
  public static void main(String[] args) {
    
    // 1. Declarando e inicializando uma variável em uma linha
    int x = 5;
    
    // 2. Declarando uma variável e inicializando-a posteriormente
    int y;
    y = 10;
    
    // 3. Declarando várias variáveis do mesmo tipo em uma linha
    int a, b, c;
    a = 1;
    b = 2;
    c = 3;
    
    // 3. Declarando e inicializando várias variáveis em uma linha
    int i = 1, j = 2, k = 3;
     
    // 4. Declarando uma variável com um valor inicial de null
    String str = null;
    
    // 5. Declarando uma variável com um valor inicial de uma string vazia
    String emptyString = "";
    
   
    // 6. Declarando uma variável usando var (Java 10+)
    var myVar = "Hello, World!";
    
    // Imprimir as variáveis no console
    System.out.println(x);
    System.out.println(y);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
    System.out.println(str);
    System.out.println(emptyString);
    System.out.println(myVar);
  }
}
