package Pesquisa.ContagemPalavras;

import java.util.HashMap;

public class ContagemPalavras {

    //Atributos
    private HashMap<String, Integer>contadorPalavras;

    //Construtor
    public ContagemPalavras(){
        this.contadorPalavras = new HashMap<>();
    }

    //Métodos
        //Getter
    public void exibirPalavras(){
        System.out.println();
        System.out.println("Exibindo todas as palavras registradas");
        for(String s: contadorPalavras.keySet()){
            System.out.printf("Palavra: %s\n", s);
            System.out.printf("Registrada %d vezes\n", contadorPalavras.get(s));
            System.out.println();
        }
    }

        //Adiciona palavra pra contagem
    public void adicionarPalavra(String palavra, Integer contagem){
        System.out.println();
        contadorPalavras.put(palavra, contagem);
        System.out.println("Palavra adicionada com sucesso!");
        System.out.printf("Palavra: %s\n", palavra);
        System.out.printf("Registrada %d vezes\n", contagem);
    }

        //Remove palavra da contagem se tiver presente
    public void removerPalavra(String palavra){
        System.out.println();
        for(String s: contadorPalavras.keySet()){
            if(s.equalsIgnoreCase(palavra)){
                contadorPalavras.remove(s);
                System.out.println("Palavra removida com sucesso!");
                System.out.printf("Palavra: %s\n", s);
                System.out.printf("Registrada %d vezes\n", contadorPalavras.get(s));
                return;
            }
        }
        System.out.println("Palavra não encontrada no registro...");
    }

        //Retorna palavra mais frequente
    public HashMap<String, Integer> encontrarPalavraMaisFrequente(){
        int maiorFrequencia = 0;
        HashMap<String, Integer> palavraMaisFrequente = new HashMap<>();

        for(String s: contadorPalavras.keySet()){
            if(contadorPalavras.get(s) > maiorFrequencia){
                maiorFrequencia = contadorPalavras.get(s);
            }
        }

        for(String s: contadorPalavras.keySet()){
            if(contadorPalavras.get(s) == maiorFrequencia){
                System.out.println("Palavra com maior frequência encontrada!");
                System.out.printf("Palavra: %s\n", s);
                System.out.printf("Registrada %d vezes\n", contadorPalavras.get(s));
                palavraMaisFrequente.put(s, contadorPalavras.get(s));
            }
        }
        return palavraMaisFrequente;
    }


}
