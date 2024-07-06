package ListInterface.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    //Representa um carrinho de compras => Lista de itens
    //Cada item é um objeto da classe Item

        //Atributo -> Lista
    private ArrayList<Item> CarrinhoCompras;

        //Construtor -> Inicializa lista vazia
    public CarrinhoDeCompras(){
        this.CarrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        CarrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        ArrayList<Item> ItensRemover = new ArrayList<>();
        for(Item i: CarrinhoCompras){
            if(i.getNome().replaceAll(" ", "").equalsIgnoreCase(nome.replaceAll(" ", ""))){
                ItensRemover.add(i);
            }
        }
        CarrinhoCompras.removeAll(ItensRemover);
    }

    public float calcularValorTotal(){
        float valorCarrinho = 0;
        for(Item i: CarrinhoCompras){
            valorCarrinho += i.getPreco() * i.getQuantidade();
        }
        return valorCarrinho;
    }

    //Acessa a lista CarrinhoCompras -> semelhante ao Getter
    public void exibirItens(){
        for(Item i: CarrinhoCompras){
            System.out.printf("\nItem = %s", i.getNome());
            System.out.printf("\nPreço unitário(R$) = %.2f", i.getPreco());
            System.out.printf("\nQuantidades = %d", i.getQuantidade());
            System.out.printf("\nValor total = %.2f\n", i.getValorTotal());
        }
    }





}
