public class Pilha1 {
    static void main(String[] args) {
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        System.out.println("Pilha inicial: " + frase);

        Stack<Character> pilha = new Stack<>();
        System.out.println("A pilha está vazia? " + (pilha.isEmpty() ? "Sim" : "Não"));

        System.out.println("Pilha inicial: " + pilha.print());

        for(int i = 0; i < frase.length(); i++){
            pilha.push(frase.charAt(i));
        }
        System.out.println("A pilha está vazia? " + (pilha.isEmpty() ? "Sim" : "Não"));
        System.out.println("Pilha atual: " + pilha.print());

        String reverso = "";
        while(!pilha.isEmpty()){
            reverso += pilha.pop();
        }
        System.out.println("Pilha depois do reverso: " + reverso);
    }
}
