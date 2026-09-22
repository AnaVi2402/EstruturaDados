import java.util.Scanner;

public class MatriculaApp {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno []turma = new Aluno[100];

        System.out.println("\nOLÁ! BEM VINDO AO SISTEMA ESCOLAR");

        int num = -1;
        String nome;
        int ra;
        int idade;
        char sexo;
        double media;
        int alunoCad = 0;

        while (num != 0) {
            System.out.println("\n========== MENU ==========");
            System.out.println("   1. Cadastrar alunos;\n   2. Relatório por nome (Crescente);\n   3. Relatório por RA (Decrescente);\n   4. Relatório de aprovados (Crescente por nome);\n   0. Sair do programa.");
            System.out.println("Digite o número da opção desejado: ");
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                System.out.println("Deseja cadastrar quantos alunos?");
                int quant = sc.nextInt() + alunoCad;
                sc.nextLine();
                for(int i = alunoCad; i<quant; i++) {
                    System.out.println("\n=========== Cadastro do aluno " + (i+1) + " ===========");

                    System.out.println("Digite o nome do aluno: ");
                    nome = sc.nextLine();

                    System.out.println("Digite o número de RA: ");
                    ra = sc.nextInt();

                    do {
                        System.out.println("Digite a idade do aluno: ");
                        idade = sc.nextInt();
                        sc.nextLine();

                        if (idade < 0){
                            System.out.println("***** IDADE INVÁLIDA, DIGITE UMA IDADE MAIOR QUE 0 *****");
                        }
                    }while (idade < 0);

                    do {
                        System.out.println("Digite o sexo do aluno (F/M): ");
                        sexo = sc.next().charAt(0);

                        if (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M'){
                            System.out.println("***** SEXO INVÁLIDO, DIGITE F OU M! *****");
                        }
                    } while (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');

                    do {
                        System.out.println("Digite a média do aluno (0-10): ");
                        media = sc.nextDouble();
                        sc.nextLine();

                        if(media < 0 || media > 10){
                            System.out.println("***** MÉDIA INVÁLIDA, DIGITE UMA MÉDIA ENTRE 0 A 10! *****");
                        }
                    }while(media < 0 || media > 10);

                    boolean resultado = media >= 6.0;
                    turma[i] = new Aluno(nome, ra, idade, sexo, media, resultado);
                }
                alunoCad = quant;
                System.out.println("\n===== ALUNOS CADASTRADOS COM SUCESSO! =====\n");
            }
            else if (num == 2){
                if (turma[0] == null){
                    System.out.println("****** NENHUM DADO CADASTRADO! ******");
                }
                else {
                    Aluno.ordenaCres(turma, alunoCad);
                    Aluno.listeAlunos(turma, alunoCad);
                }
            }else if (num == 3){
                if (turma[0] == null){
                    System.out.println("****** NENHUM DADO CADASTRADO! ******");
                }
                else {
                    Aluno.ordenaDecres(turma, alunoCad);
                    Aluno.listeAlunos(turma, alunoCad);
                }
            }else if (num == 4){
                if (turma[0] == null){
                    System.out.println("****** NENHUM DADO CADASTRADO! ******");
                }
                else {
                    Aluno.ordenaCres(turma, alunoCad);
                    Aluno.listeAprovado(turma, alunoCad);
                }
            }
            else if (num == 0){
                System.out.println("\n---------- PROGRAMA FINALIZADO! ----------");
            }
            else {
                System.out.println("Opção não reconhecida, escolha novamente! ");
            }
        }
    }
}