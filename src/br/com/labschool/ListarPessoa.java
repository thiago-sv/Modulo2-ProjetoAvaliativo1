package br.com.labschool;

import java.util.Scanner;

public class ListarPessoa {

    static void listarPessoa() {
        Scanner scan = new Scanner(System.in);
        boolean aux = false;
        System.out.println(
                "\nQual categoria você deseja listar? \n Digite 1 para estudantes \n Digite 2 para professores \n Digite 3 para funcionários \n Digite 4 para todos");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                for (Estudante estudante : CadastraEstudante.estudantes) {
                    System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                            + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                    aux = true;
                }
                if (aux == false) {
                    System.out.println("Nenhum estudante cadastrado\n");
                }
                break;
            case 2:
                for (Professor professor : CadastraProfessor.professores) {
                    System.out.println("Código: " + professor.getCodigoIdentificador() + " Nome: "
                            + professor.getNome() + " CPF: " + professor.getCpf() + "\n");
                    aux = true;
                }
                if (aux == false) {
                    System.out.println("Nenhum professor cadastrado\n");
                }
                break;
            case 3:
                for (Pedagogo pedagogo : CadastraPedagogo.pedagogos) {
                    System.out.println("Código: " + pedagogo.getCodigoIdentificador() + " Nome: "
                            + pedagogo.getNome() + " CPF: " + pedagogo.getCpf() + "\n");
                    aux = true;
                }
                if (aux == false) {
                    System.out.println("Nenhum funcionario cadastrado\n");
                }
                break;
            case 4:
                System.out.println("--------------Estudantes----------------");
                for (Estudante estudante : CadastraEstudante.estudantes) {
                    System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                            + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                    aux = true;
                }
                System.out.println("--------------Professores----------------");
                for (Professor professor : CadastraProfessor.professores) {
                    System.out.println("Código: " + professor.getCodigoIdentificador() + " Nome: "
                            + professor.getNome() + " CPF: " + professor.getCpf() + "\n");
                    aux = true;
                }
                System.out.println("--------------Funcionários----------------");
                for (Pedagogo pedagogo : CadastraPedagogo.pedagogos) {
                    System.out.println("Código: " + pedagogo.getCodigoIdentificador() + " Nome: "
                            + pedagogo.getNome() + " CPF: " + pedagogo.getCpf() + "\n");
                    aux = true;
                }
                if (aux == false) {
                    System.out.println("Nenhuma pessoa cadastrada\n");
                }
                break;
            default:
                System.out.println("Opção inválida\n");
                break;
        }
    }
}
