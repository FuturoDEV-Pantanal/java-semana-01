package booleans;

public class BooleanOperators {
  
    public static void main(String[] args) {
      
      boolean x = true;
      boolean y = false;
      
      // Boolean AND operator (&&) (E)
      if (x && y) {
        System.out.println("Isso não será impresso, pois x E y é falso");
      }
      
      // Boolean OR operator (||) (OU)
      if (x || y) {
        System.out.println("Isso será impresso, pois x OU y é verdadeiro");
      }
      
      // Boolean NOT operator (!) (INVERTE VALOR)
      if (!y) {
        System.out.println("Isso será impresso, pois !y é verdadeiro");
      }
      
      // Combinando múltiplos operadores booleanos
      if ((x || y) && !(x && y)) {
        System.out.println("Isso será impresso, pois (x OU y) E !(x E y) é verdadeiro");
      }
      
    }
}


