public class Fila {
    static void main(String[] args) {
        Queue<String> fila = new Queue<>();
        System.out.println(fila.print());

        fila.enqueue("Alexandre");
        fila.enqueue("José");
        fila.enqueue("João");
        fila.enqueue("Maria");
        System.out.println(fila.print());

        String proximo = fila.peek();
        System.out.println("Próximo da fila: " + proximo);

        String atendimento = fila.dequeue();
        System.out.println("Chamar para atendimento: "+ atendimento);

        proximo = fila.peek();
        System.out.println("Próximo da fila: " + proximo);
        System.out.println(fila.print());
    }
}
