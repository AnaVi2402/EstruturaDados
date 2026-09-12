public class BuscaSequencial {

    public static int buscaSequencialInt (Integer[] vetor, Integer valorBusca){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(valorBusca)){
                return i;
            }
        }
        return -1;
    }

    public static int buscaSequencialString (String[] vetor, String resultBusca){
        for(int i=0; i < vetor.length; i++){
            if(vetor[i].equals(resultBusca)){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        Integer[] numeros = {5,7,9,8,1,3,44,66,12};

        String[] frutas = {"laranja", "maçã", "pêra", "uva", "limão", "mamão", "tangerina"};

        System.out.println("Posição do número 44: " + buscaSequencialInt(numeros,44));
        System.out.println("Posição do número 100: " + buscaSequencialInt(numeros,100) + "\n");

        System.out.println("Posição da uva: " + buscaSequencialString(frutas, "uva"));
        System.out.println("Posição da morango: " + buscaSequencialString(frutas, "morango"));
    }
}
