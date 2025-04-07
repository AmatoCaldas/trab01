package trab01;

import java.util.ArrayList;
import java.util.List;

// Classe genérica que permite armazenar e manipular itens de qualquer tipo
public class ColecaoGenerica<T> {
    // Lista interna para armazenar os itens da coleção
    private List<T> itens;

    // Construtor que inicializa a lista de itens
    public ColecaoGenerica() {
        itens = new ArrayList<>();
    }

    // Método para adicionar um item à coleção
    public void adicionar(T item) {
        itens.add(item);
    }

    // Método para obter um item da coleção com base no índice
    public T obter(int index) {
        return itens.get(index);
    }
}
