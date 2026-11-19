/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Ana Vitória Alves de Oliveira
package com.alexandre.aulased3ads20262.lib;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class Stack<T> {
    
    private ArrayList<T> data; // Lista interna privada
    private ArrayList<T> historyData; //exercicio 2.1
    private int limit; //exercício 4.1

    public Stack(int limit) {
        this.data = new ArrayList<T>(); // lista vazia
        this.historyData = new ArrayList<>(); // exercício 2.1
        this.limit = limit; // exercício 4.1
    }

    public Stack(){
        this(100);
    }
    
    //método para inserção de dados na pilha
    public void push(T val){
        if (this.data.size() >= this.limit){ //exercício 4.2
            System.out.println("Limite de " + this.limit + " ações atingido!");
        }
        else {
            this.data.add(val);
        }
    }
    
    //método para remoção de dados na pilha
    public T pop(){
        if(isEmpty()) return null;
        T removed = this.data.remove(this.data.size() - 1);
        this.historyData.add(removed); //exercício 2.2
        return removed;
    }
    
    //método para informar se a pilha está vazia
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    
    //método para consultar o topo (última posição) da pilha (sem remover)
    public T peek(){
        if(isEmpty()) return null;
        return this.data.get(this.data.size() - 1);
    }
    //exercício 2.3
    public ArrayList<T> getHistory(){
        return this.historyData;
    }
    
    // método que imprime a pilha para efeitos de depuração
    public String print(){
        return this.data.toString();
    }
}


