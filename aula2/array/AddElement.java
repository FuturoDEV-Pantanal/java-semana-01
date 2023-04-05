package array;
/*
 *Para inserir e remover dados de uma array em Java, 
 é necessário criar uma nova array com tamanho maior 
 ou menor do que a array original e copiar os elementos 
 da array original para a nova array. Existem algumas maneiras de fazer isso, 
 dependendo da posição em que o novo elemento deve ser inserido ou removido.
  Seguem abaixo algumas sugestões de implementação:
*/

/* Nesse exemplo, é criada uma nova array com tamanho 
igual à array original mais um elemento. Em seguida, 
os elementos da array original são copiados 
para a nova array e o novo elemento é inserido no final da nova array. 
Por fim, a nova array é retornada.*/

public class AddElement {

    public static int[] inserirElemento(int[] array, int novoElemento) {

        int tamanho = array.length;
        int[] novaArray = new int[tamanho + 1];
    
        for (int i = 0; i < tamanho; i++) {
            novaArray[i] = array[i];
        }
    
        novaArray[tamanho] = novoElemento;
    
        return novaArray;
    }
    
    }
    