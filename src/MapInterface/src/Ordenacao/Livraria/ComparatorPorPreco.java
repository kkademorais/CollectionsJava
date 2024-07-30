package Ordenacao.Livraria;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator <LivroChave>{
    @Override
    public int compare(LivroChave l1, LivroChave l2) {
        int precoComparison = Double.compare(l1.getPreco(), l2.getPreco());
        if(precoComparison != 0){
            return precoComparison;
        }
        return l1.getLink().compareTo(l2.getLink());

    }
}
