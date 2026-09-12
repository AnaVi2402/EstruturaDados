public class BuscaBinariaGenerica {

    public static <T extends Comparable<T>> int buscaBinariaGenerica(T[] vetor, T valorBusca){
        int ini = 0;
        int fim = vetor.length - 1;

        while(ini <= fim){
            int meio = (ini + fim) / 2;

            int comparacao = valorBusca.compareTo(vetor[meio]);

            if(comparacao == 0){
                return meio;
            }else if (comparacao > 0){
                ini = meio + 1;
            }else {
                fim = meio -1;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        Integer[] nums = {0,11,22,33,44,55,66,77,88,99,100};
        String[] names = {"ADAMASTOR","ALEXANDRE", "ANA", "CARLOS","DANIEL", "FERNANDO","GUSTAVO","MARIA","ZULEIDE"};

        System.out.println("A posição de 77: " + buscaBinariaGenerica(nums,77));
        System.out.println("A posição do ALEXANDRE: " + buscaBinariaGenerica(names,"ALEXANDRE"));
    }
}
