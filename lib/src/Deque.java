import java.util.ArrayList;

public class Deque <T> {
    private ArrayList<T> data;

    public Deque(){
        this.data = new ArrayList<T>();
    }

    //método para inserção no início da estrutura
    public void insertFront (T val){
        this.data.add(0, val);
    }

    //método para inserção no final da estrutura
    public void insertBack (T val){
        this.data.add(val);
    }

    //método para remoção no inicio da estrutura
    public T removeFront(){
        if(isEmpty()) return null;
        return this.data.remove(0);
    }

    //método para remoção no final da estrutura
    public T removeBack(){
        if(isEmpty()) return null;
        return this.data.remove(this.data.size() - 1);
    }

    //método para consultar o início da estrutura (sem remover)
    public T peekFront(){
        if (isEmpty()){
            return null;
        }
        return this.data.get(0);
    }

    //método para consultar o início da estrutura (sem remover)
    public T peekBack() {
        if (isEmpty()) {
            return null;
        }
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //método que imprimi a fola (para efeitos de depuração)
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for (int i=0; i< this.data.size(); i++){
            if(output.length() > 2){
                output.append(", ");
            }
            output.append("(").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}
