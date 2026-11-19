import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> data; //Lista privada

    public Queue(){
        this.data = new ArrayList<T>();
    }

    //método para inserção de dados na fila
    public void enqueue (T val){
        this.data.add(val);
    }

    //método para remoção de dados na fila
    public T dequeue(){
        if(data.isEmpty()){
            return null;
        }
        return this.data.remove(0);
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    public T peek(){
        if (data.isEmpty()){
            return null;
        }
        return this.data.get(0);
    }

    //método que imprimi a fola (para efeitos de depuração)
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for (int i=0; i< this.data.size(); i++){
            if(output.length() > 2){
                output.append(", ");
            }
            output.append("(").append(i + 1).append("º): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}


