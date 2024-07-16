package ListInterface.Ordenacao.OrdenacaoPessoas;

public class Main {
    public static void main(String[] args) {

        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();

        System.out.println("Printando lista inicialmente vazia: ");
        System.out.println(listaPessoas);

        listaPessoas.adicionarPessoa("Kaike", 20, 1.85);
        listaPessoas.adicionarPessoa("Barreto", 19, 1.78);
        listaPessoas.adicionarPessoa("Vimieiro", 18, 1.82);

        System.out.println();
        System.out.println("Printando lista agora preenchida: ");
        listaPessoas.printarPessoas();

        System.out.println();
        System.out.println("Ordenando pessoas da lista por idade: ");
        listaPessoas.ordenarPorIdade();

        System.out.println();
        System.out.println("Ordenando pessoas da lista por altura: ");
        listaPessoas.ordenarPorAltura();


    }
}
