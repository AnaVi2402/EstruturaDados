public class BuscaBinaria {

    public static int buscaBinariaInt (Integer[] vetor, Integer valorBusca){
        int ini = 0;
        int fim = vetor.length - 1; //length retorna o tamanho do vetor que seria 7, como preciso da posição, preciso colocar o -1
        while(fim>=ini){
            int meio = (ini + fim) / 2; //em Java, ele traz somente os número inteiro quando é declarado com int, em outra linguagem pode ser que não

            if(valorBusca.equals(vetor[meio])){
                return meio;
            }else if(valorBusca > vetor[meio]){
                ini = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Integer[] nums = {0,11,22,33,44,55,66,77,88,99};
        String[] names = {"ADAMASTOR","ALEXANDRE", "ANA", "CARLOS","DANIEL", "MARIA"};

        System.out.println("Posição número 66: " + buscaBinariaInt(nums, 66));
    }
}
