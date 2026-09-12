import java.util.Arrays;

public class MergeSort {

    public static <MS extends Comparable<MS>> void mergeSort(MS[] vetor) {
        // Caso base: se o vetor tem 0 ou 1 elemento, já está ordenado
        if (vetor.length < 2) {
            return;
        }

        int meio = vetor.length / 2;

        MS[] vetEsq = Arrays.copyOfRange(vetor, 0, meio);
        MS[] vetDir = Arrays.copyOfRange(vetor, meio, vetor.length);

        // Chamadas recursivas
        mergeSort(vetEsq);
        mergeSort(vetDir);

        // Mesclagem (Merge)
        int posEsq = 0, posDir = 0, posRes = 0;

        while (posEsq < vetEsq.length && posDir < vetDir.length) {

            if (vetEsq[posEsq].compareTo(vetDir[posDir]) <= 0) {
                vetor[posRes] = vetEsq[posEsq];
                posEsq++;
            } else {

                vetor[posRes] = vetDir[posDir];
                posDir++;
            }
            posRes++;
        }

        while (posEsq < vetEsq.length) {
            vetor[posRes] = vetEsq[posEsq];
            posEsq++;
            posRes++;
        }

        while (posDir < vetDir.length) {
            vetor[posRes] = vetDir[posDir];
            posDir++;
            posRes++;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {77, 44, 22, 33, 99, 55, 88, 0, 66};
        String[] nomesDesor = {"maria", "joao", "carlos", "beatriz"};

        mergeSort(nums);
        System.out.println(Arrays.toString(nums));

        mergeSort(nomesDesor);
        System.out.println(Arrays.toString(nomesDesor));
    }
}
