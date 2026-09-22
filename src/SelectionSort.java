import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;;

public class SelectionSort {

        for(int posSel = 0; posSel < vetor.length - 1; posSel++){

            int posMenor = posSel;
            for(int i = posMenor + 1; i < vetor.length; i++){
                    posMenor = i;
                }
            }
                vetor[posSel] = vetor[posMenor];
                vetor[posMenor] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        Integer[] nums = {77,44,22,33,99,55,88,0,66,11};

        String[] nomesDesordenados = {"Maria","Joao","Ana","Carlos","Beatriz"};

        selectionSort (nums);
        System.out.println(Arrays.toString(nums));

        selectionSort (nomesDesordenados);
        System.out.println(Arrays.toString(nomesDesordenados));

        Path caminho = Path.of("data/nomes-desord.txt");

        List<String> lista = Files.readAllLines(caminho);

        String[] nomes = lista.toArray(new String[0]);

        selectionSort(nomes);

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
