public class TesteDeque {
    static void main(String[] args) {
        Deque<String> listaCompras = new Deque ();
        System.out.println(listaCompras.print());

        //Alimenticios = inicio
        listaCompras.insertFront("Arroz");
        listaCompras.insertFront("Feijão");
        listaCompras.insertFront("Macarrão");
        System.out.println(listaCompras.print());

        //Higiene/Limpeza = final
        listaCompras.insertBack("Sabão em pó");
        listaCompras.insertBack("Desodorante");
        listaCompras.insertBack("Água sanitária");
        System.out.println(listaCompras.print());

        listaCompras.insertFront("Café");
        listaCompras.insertBack("Amaciante");
        System.out.println(listaCompras.print());

        listaCompras.insertFront("Açúcar");
        System.out.println(listaCompras.print());

        String removido = listaCompras.removeFront();
        System.out.println("Removido: " + removido);

        System.out.println(listaCompras.print());

        removido = listaCompras.removeBack();
        System.out.println(listaCompras.print());

        String primeiro = listaCompras.peekFront();
        String ultimo = listaCompras.peekBack();

        System.out.println("Primeiro da lista " + primeiro);
        System.out.println("Último da lista " + ultimo);
    }
}
