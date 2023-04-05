package array;

/*
 * 
Esse método recebe como parâmetro uma array e
 um elemento a ser removido. Ele cria uma nova array
  com tamanho menor e copia os elementos da array original
 para a nova array, exceto o elemento que será removido. 
 Em seguida, retorna a nova array.
 * 
 * 
 */

public class RemoveElementArray { 
    
    public static int[] removerElemento(int[] array, int elemento) {
        //Identifica tamanho array inicial.
        int tamanho = array.length;
        // Declara nova array.           
        int[] novaArray = new int[tamanho - 1];

        //Copia elemento para nova array SE não for elemento a ser removido.    
        for (int i = 0; i < tamanho; i++) {
            if (array[i] != elemento) {
                novaArray[i] = array[i];
            }
        }

        return novaArray;
    }
}


