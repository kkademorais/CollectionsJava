package SetInterface.Pesquisa.AgendaContatos;

import java.util.HashSet;

public class AgendaContatos {

    //Atributo
    private HashSet<Contato> ListaContatos;

    //Construtor -> inicializa lista vazia
    public AgendaContatos(){
        this.ListaContatos = new HashSet<>();
    }

    //Métodos

        //Adiciona contato na lista
    public void adicionarContato(String nome, int numeroTelefone){
        Contato contatoAdd = new Contato(nome, numeroTelefone);
        ListaContatos.add(contatoAdd);
        System.out.println();
        System.out.println("Contato adicionado!");
        System.out.printf("Nome: %s", contatoAdd.getNome());
        System.out.printf("\nNúmero de telefone: %d\n", contatoAdd.getNumeroTelefone());
    }

        //Pesquisa contatos por nome -> retorna lista com encontrados
    public void pesquisarPorNome(String nome){
        HashSet<Contato>ListaContatosProcurados = new HashSet<>();
        for(Contato c: ListaContatos){
            if(c.getNome().equalsIgnoreCase(nome.replace(" ", ""))){
                ListaContatosProcurados.add(c);
            }
            //TERMINAR -> NÚMERO DE PARÂMETROS (?)
        }
        System.out.println("Retornando lista com contatos encontrados: ");
        for(Contato c: ListaContatosProcurados){
            System.out.printf("\nNome: %s", c.getNome());
            System.out.printf("\nNúmero de telefone: %d\n", c.getNumeroTelefone());
        }
    }

        //Busca contato e atualiza número de telefone
    public void atualizarNumeroContato(String nome, int novoNumero){
        System.out.println("Atualizando número de telefone!");
        System.out.printf("Contato a ser atualizado: %s\n", nome);
        for(Contato c: ListaContatos){
            if(c.getNome().equalsIgnoreCase(nome.replace(" ", ""))){
                //c.getNumeroTelefone() = novoNumero;
                    //Terminar
            }
        }
        System.out.println();
        System.out.println("Contato atualizado!");
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nNúmero de telefone: %d\n", novoNumero);
    }

        //Getter -> Exibe contatos da lista
    public void exibirContatos(){
        System.out.println("Exibindo toda a lista de contatos: ");
        for(Contato c: ListaContatos){
            System.out.printf("\nNome: %s", c.getNome());
            System.out.printf("\nNúmero de telefone: %d\n", c.getNumeroTelefone());
        }
    }

}
