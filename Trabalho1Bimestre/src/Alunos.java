public class Alunos {
    private String nome;
    private int ra;
    private int idade;
    private char sexo;
    private double media;
    private boolean resultado;

    public Alunos() {
    }

    public Alunos(String nome, int ra, int idade, char sexo, double media, boolean resultado) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
        this.resultado = resultado;
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
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", media=" + media +
                ", resultado=" + resultado +
                '}';
    }
}

