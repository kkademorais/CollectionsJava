package ListInterface.Pesquisa.CatalogoLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        System.out.println("Testando catálogo vazio: ");

        System.out.printf("Livros publicados entre os anos de 0 e 2000 : %s \n", catalogo.pesquisarPorIntervaloAnos(0, 2000));
        System.out.printf("Lista com livros do Carlos Drummond Andrade: %s \n", catalogo.pesquisarPorAutor("Carlos Drummond Andrade"));
        System.out.printf("Procurando Pequeno Principe no catálogo: %s \n", catalogo.pesquisarPorTitulo("Pequeno Principe"));

        System.out.println();
        System.out.println("Adicionando livros no catálogo: ");
        catalogo.adicionarLivro("Pequeno Principe", "Antoine", 1956);
        catalogo.adicionarLivro("Harry Potter", "Rowling", 1960);
        catalogo.adicionarLivro("Pé de Laranja Lima", "Carlos Drummond Andrade", 1986);


        System.out.printf("Livros publicados entre os anos de 1945 e 1970 : %s \n", catalogo.pesquisarPorIntervaloAnos(1945, 1970));
        System.out.printf("Lista com livros do Carlos Drummond Andrade: %s \n", catalogo.pesquisarPorAutor("CarlosDrummondAndrade"));
        System.out.printf("Procurando Pequeno Principe no catálogo: %s \n", catalogo.pesquisarPorTitulo("PequenoPrincipe"));
    }
}
