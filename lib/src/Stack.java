import java.util.ArrayList;

public class Stack<T>{
    private ArrayList<T> data;

    public Stack(){
        this.data = new ArrayList<>();
    }

    //método de inserção
    public void push(T val){
        this.data.add(val);
    }
    //método para remoção de dados na pilha
    public T pop(){
        if(isEmpty()){
            return null;
        }
        return this.data.remove(this.data.size() - 1);
    }

    //método para informar se a pilha está vazia
    public boolean isEmpty(){
        return (this.data.isEmpty());
    }

    //método para consultar o topo (última posição) da pilha (sem remover)
    public T peck(){
        if(isEmpty()) return null;
        return this.data.get(this.data.size() - 1);
    }

    //método que imprime a pilha para efeitos de depuração
    public String print(){
        return this.data.toString();
    }
}
