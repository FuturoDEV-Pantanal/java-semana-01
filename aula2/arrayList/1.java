package arrayList;
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando um ArrayList vazio
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        // Acessando elementos do ArrayList
        System.out.println("Primeiro nome: " + nomes.get(0));
        System.out.println("Tamanho do ArrayList: " + nomes.size());

        // Removendo um elemento do ArrayList
        nomes.remove(1);

        // Verificando se um elemento existe no ArrayList
        System.out.println("João está na lista? " + nomes.contains("João"));

        // Acessando o último elemento do ArrayList
        String ultimoElemento = nomes.get(nomes.size() - 1);
        System.out.println("Último elemento: " + ultimoElemento);

        // Iterando sobre os elementos do ArrayList
        System.out.println("Lista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
