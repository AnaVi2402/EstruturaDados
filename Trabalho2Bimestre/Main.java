//Ana Vitória Alves de Oliveira
package com.alexandre.aulased3ads20262.lib;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n --- TESTE EXERCÍCIO 01: Contador de Enqueue e Dequeue --- ");
        Queue<String> filaAtendimento = new Queue<>();
        filaAtendimento.enqueue("Wilton");
        filaAtendimento.enqueue("José");
        filaAtendimento.enqueue("Ana");
        System.out.println("Fila completa: " + filaAtendimento.print());
        System.out.println("Paciente atendido: " + filaAtendimento.dequeue());
        System.out.println("Paciente atendido: " + filaAtendimento.dequeue());
        System.out.println("Fila após dois atendimentos: " + filaAtendimento.print());
        System.out.println("Total das operações: " + filaAtendimento.getOperationCount());

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 2: Histórico de remoção --- ");
        Stack<String> navegacao = new Stack<>();
        navegacao.push("www.google.com");
        navegacao.push("www.github.com");
        navegacao.push("www.linkedin.com");
        System.out.println("Pilha completa: " + navegacao.print());
        System.out.println("Após desfazer a página de navegação: " + navegacao.pop());
        System.out.println("Após desfazer a página de navegação: " + navegacao.pop());
        System.out.println("Pilha após duas remoções: " + navegacao.print());
        System.out.println("Histórico de remoções: " + navegacao.getHistory());

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 3: Deque com limite");
        Deque<String> dequeLimitado = new Deque<>(5);
        dequeLimitado.insertBack("Ana Vitória");
        dequeLimitado.insertFront("Wilton");
        dequeLimitado.insertFront("José");
        dequeLimitado.insertBack("Antônio");
        dequeLimitado.insertFront("Renata");
        System.out.println("Deque após 5 inserções: " + dequeLimitado.print());
        dequeLimitado.insertFront("Ana Beatriz");
        System.out.println("Deque após a tentativa de uma 6º inserção: " + dequeLimitado.print());

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 4: Pilha com capacidade máxima");
        Stack<String> pilhaDesfazer = new Stack<>(5);
        pilhaDesfazer.push("Escrever texto");
        pilhaDesfazer.push("Desfazer");
        pilhaDesfazer.push("Refazer");
        pilhaDesfazer.push("Editar texto");
        pilhaDesfazer.push("Desfazer");
        System.out.println("Segue as 5 ações completas: " + pilhaDesfazer.print());
        pilhaDesfazer.push("Pícles");
        System.out.println("Pilha após erro: " + pilhaDesfazer.print());
        System.out.println("Ação de desfazer: " + pilhaDesfazer.pop());
        System.out.println("Ação de desfazer: " + pilhaDesfazer.pop());
        System.out.println("Pilha após desfazer 2 ações: " + pilhaDesfazer.print());

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 5: Deque com elementos únicos");
        Deque<String> carrinhoDeCompras = new Deque<>();
        carrinhoDeCompras.insertFront("Paleta de maquiagem");
        carrinhoDeCompras.insertBack("Batom nude");
        carrinhoDeCompras.insertBack("Blush");
        carrinhoDeCompras.insertFront("Esmalte preto");
        System.out.println("Carrinho antes de tentar inserir inte repetido: " + carrinhoDeCompras.print() + "\n");
        carrinhoDeCompras.insertFront("Batom nude");
        System.out.println("Após a tentativa no insertFront\n");
        carrinhoDeCompras.insertBack("Esmalte preto");
        System.out.println("Após a tentativa no insertBack");

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 6: Histórico de remoção na lista encadeada");
        LinkedList<String> lista = new LinkedList<>();
        lista.insertTail("A");
        lista.insertTail("B");
        lista.insertTail("C");
        lista.insertTail("D");
        lista.insertTail("E");
        System.out.println("Segue a lista inicial: " + lista.print());
        lista.remove(3);
        lista.removeHead();
        lista.removeTail();
        System.out.println("Lista atualizada após remoção: " + lista.print() +
                "\nHistórico de remoção: " + lista.getHistory());


        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 7: Reversão da lista encadeada.");
        LinkedList<String> listaNomes = new LinkedList<>();
        listaNomes.insertTail("Ana");
        listaNomes.insertTail("Beatriz");
        listaNomes.insertTail("Maria");
        listaNomes.insertTail("Wilton");
        System.out.println("Lista de nomes original: " + listaNomes.print());
        listaNomes.reverse();
        System.out.println("Lista de nomes após a inversão: " + listaNomes.print());



        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 8: Contagem de ocorrências");
        LinkedList<String> contagemOcorrecias = new LinkedList<>();
        contagemOcorrecias.insertTail("A");
        contagemOcorrecias.insertTail("B");
        contagemOcorrecias.insertTail("A");
        contagemOcorrecias.insertTail("C");
        contagemOcorrecias.insertTail("B");
        contagemOcorrecias.insertTail("A");
        System.out.println("Segue a lista: " + contagemOcorrecias.print() +
                "\nA repetição de ocorrências da letra A são: " + contagemOcorrecias.contOccurrences("A") +
                "\nA repetição de ocorrências da letra B são: " + contagemOcorrecias.contOccurrences("B") +
                "\nA repetição de ocorrências da letra C é: " + contagemOcorrecias.contOccurrences("C") +
                "\nErro de ocorrência que não existe: " + contagemOcorrecias.contOccurrences("N"));

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 9: Remoção de todas as ocorrências");
        LinkedList<String> listaComRepeticoes = new LinkedList<>();
        listaComRepeticoes.insertTail("A");
        listaComRepeticoes.insertTail("B");
        listaComRepeticoes.insertTail("A");
        listaComRepeticoes.insertTail("C");
        listaComRepeticoes.insertTail("D");
        listaComRepeticoes.insertTail("A");
        System.out.println("Segue lista atual: " + listaComRepeticoes.print());
        listaComRepeticoes.removeAll("A");
        System.out.println("Segue a lista após remover as ocorrências da letra A: " + listaComRepeticoes.print());

        System.out.println("\n================================================================================================================");

        System.out.println("\n --- TESTE EXERCÍCIO 10: Transformação da Lista Encadeada para o Array/List");
        LinkedList<String> listArray = new LinkedList<>();
        listArray.insertTail("Ana");
        listArray.insertTail("Vitória");
        listArray.insertTail("Wilton");
        listArray.insertTail("José");
        listArray.insertTail("Fernanda");
        System.out.println("Segue o LinkedList: " + listArray.print());
        ArrayList<String> arrayList = listArray.toArray();
        System.out.println("Segue a transformação para ArrayList: " + arrayList);
    }
}
