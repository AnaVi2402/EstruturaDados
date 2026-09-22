import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int ra;
    private int idade;
    private char sexo;
    private double media;
    private boolean resultado = false;

    public Aluno() {
        this("Sem nome", 0, 0, ' ',0, false);
    }

    public Aluno(String nome, int ra, int idade, char sexo, double media, boolean resultado) {
        this.nome = nome;
        this.ra = ra;
        setIdade(idade);
        setSexo(sexo);
        setMedia(media);
        this.resultado = resultado;
    }

    public static void ordenaCres(Aluno [] vetor, int totalCad){
        for(int posSel = 0; posSel < totalCad- 1; posSel++){

            int posMenor = posSel;
            for(int i = posMenor + 1; i < totalCad; i++){
                if(vetor[i].getNome().compareToIgnoreCase(vetor[posMenor].getNome()) < 0){
                    posMenor = i;
                }
            }
            Aluno temp = vetor[posSel];
            vetor[posSel] = vetor[posMenor];
            vetor[posMenor] = temp;
        }
    }
    public static void ordenaDecres(Aluno [] vetor, int totalCad){
        for(int posSel = 0; posSel < totalCad- 1; posSel++){

            int posMaior = posSel;
            for(int i = posMaior + 1; i < totalCad; i++){
                if(vetor[i].getRa() > (vetor[posMaior].getRa())){
                    posMaior = i;
                }
            }
            Aluno temp = vetor[posSel];
            vetor[posSel] = vetor[posMaior];
            vetor[posMaior] = temp;
        }
    }

    public static void listeAlunos(Aluno [] vetor, int totalCad){
        System.out.println("\n     NOME       |    RA    | IDADE | SEXO | MÉDIA  | RESULTADO ");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0 ; i < totalCad ; i++){
            System.out.printf("%-15.15s | %-8d | %-5d | %-4c | %-6.2f | %-10s%n",
                    vetor[i].getNome(),
                    vetor[i].getRa(),
                    vetor[i].getIdade(),
                    vetor[i].getSexo(),
                    vetor[i].getMedia(),
                    vetor[i].isResultado() ? "Aprovado" : "Reprovado");
        }
    }
    public static void listeAprovado(Aluno [] vetor, int totalCad){
        System.out.println("\n     NOME       |    RA    | IDADE | SEXO | MÉDIA  | RESULTADO ");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0 ; i < totalCad ; i++){
            if (vetor[i].isResultado()) {
                System.out.printf("%-15.15s | %-8d | %-5d | %-4c | %-6.2f | %-10s%n",
                        vetor[i].getNome(),
                        vetor[i].getRa(),
                        vetor[i].getIdade(),
                        vetor[i].getSexo(),
                        vetor[i].getMedia(),
                        vetor[i].isResultado() ? "Aprovado" : "Reprovado");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
        else {
            System.out.println("***** IDADE INVÁLIDA! *****");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'f' || sexo == 'F' || sexo == 'm' || sexo == 'M'){
            this.sexo = sexo;
        }
        else {
            System.out.println("***** SEXO INVÁLIDO *****");
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media >= 0 && media <=10) {
            this.media = media;
        }
        else {
            System.out.println("***** NOTA INVÁLIDA *****");
        }
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

}