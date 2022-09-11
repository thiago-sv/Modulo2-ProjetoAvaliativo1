package br.com.labschool;

import java.util.Scanner;

public class Relatorios {

    public static void relatorios() {

        Scanner scan = new Scanner(System.in);
        boolean b = true;
        boolean aux = false;

        System.out.println(
                "Digite a opção de relatório desejado\n1 - Relatório de estudantes \n2 - Relatório de professores \n3 - Alunos com mais atendimentos pedagógicos \n4 - Pedagogos com mais atendimentos pedagógicos");
        int key = scan.nextInt();

        while (b) {
            switch (key) {

                case 1:
                    System.out.println(
                            "\n Selecione a categoria que deseja listar: \n1 - Estudantes ativos \n2 - Estudantes irregulares \n3 - Estudantes em atendimento pedagógico \n4 - Estudantes inativos \n5 - Todos \n");
                    int num = scan.nextInt();

                    switch (num) {
                        case 1:
                            System.out.println("-------Lista de estudantes ativos-------\n");
                            for (Estudante estudante : CadastraEstudante.estudantes) {
                                if (estudante.getStatus().equals("Ativo")) {
                                    System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                                            + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum estudante para listar nessa categoria!\n");
                            }

                            b = false;
                            break;

                        case 2:
                            System.out.println("-------Lista de estudantes irregulares-------\n");
                            for (Estudante estudante : CadastraEstudante.estudantes) {
                                if (estudante.getStatus().equals("Irregular")) {
                                    System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                                            + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum estudante para listar nessa categoria!\n");
                            }

                            b = false;
                            break;

                        case 3:
                            System.out.println("-------Lista de estudantes em atendimento pedagógico-------\n");
                            for (Estudante estudante : CadastraEstudante.estudantes) {
                                if (estudante.getStatus().equals("Atendimento pedagógico")) {
                                    System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                                            + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum estudante para listar nessa categoria!\n");
                            }

                            b = false;
                            break;

                        case 4:
                            System.out.println("-------Lista de estudantes inativos-------\n");
                            for (Estudante estudante : CadastraEstudante.estudantes) {
                                if (estudante.getStatus().equals("Inativo")) {
                                    System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                                            + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum estudante para listar nessa categoria!\n");
                            }

                            b = false;
                            break;

                        case 5:
                            System.out.println("-------Lista de todos estudantes cadastrados-------\n");
                            for (Estudante estudante : CadastraEstudante.estudantes) {

                                System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                                        + estudante.getNome() + " CPF: " + estudante.getCpf() + "\n");
                                aux = true;
                            }
                            if (aux == false) {
                                System.out.println("Nenhum estudante para listar nessa categoria!\n");
                            }
                            b = false;
                            break;

                        default:
                            System.out.println("Opção inválida\n");
                            break;

                    }
                    break;
                case 2:
                    System.out.println(
                            "\n Selecione a categoria que deseja listar: \n1 - Professores Front-end \n2 - Professores Back-end \n3 - Professores Full-stack \n4 - Todos \n");
                    int num2 = scan.nextInt();

                    switch (num2) {
                        case 1:
                            System.out.println("-------Lista de professores Front-end-------\n");
                            for (Professor professor : CadastraProfessor.professores) {
                                if (professor.getExperiencia().equals("Front-End")) {
                                    System.out.println("Código: " + professor.getCodigoIdentificador() + " Nome: "
                                            + professor.getNome() + " CPF: " + professor.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum professor para listar nessa categoria!\n");
                            }

                            b = false;
                            break;

                        case 2:
                            System.out.println("-------Lista de professores Back-end-------\n");
                            for (Professor professor : CadastraProfessor.professores) {
                                if (professor.getExperiencia().equals("Back-End")) {
                                    System.out.println("Código: " + professor.getCodigoIdentificador() + " Nome: "
                                            + professor.getNome() + " CPF: " + professor.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum professor para listar nessa categoria!\n");
                            }
                            b = false;
                            break;

                        case 3:
                            System.out.println("-------Lista de professores Full-stack-------\n");
                            for (Professor professor : CadastraProfessor.professores) {
                                if (professor.getExperiencia().equals("Full-Stack")) {
                                    System.out.println("Código: " + professor.getCodigoIdentificador() + " Nome: "
                                            + professor.getNome() + " CPF: " + professor.getCpf() + "\n");
                                    aux = true;
                                }
                            }
                            if (aux == false) {
                                System.out.println("Nenhum professor para listar nessa categoria!\n");
                            }
                            b = false;
                            break;

                        case 4:
                            System.out.println("-------Lista de todos professores cadastrados-------\n");

                            for (Professor professor : CadastraProfessor.professores) {

                                System.out.println("Código: " + professor.getCodigoIdentificador() + " Nome: "
                                        + professor.getNome() + " CPF: " + professor.getCpf() + "\n");
                                aux = true;

                            }
                            if (aux == false) {
                                System.out.println("Nenhum professor para listar nessa categoria!\n");
                            }
                            b = false;
                            break;

                        default:
                            System.out.println("Opção inválida\n");
                            break;
                    }

                    break;

                case 3:
                    System.out.println("-----Alunos com mais atendimentos pedagógicos-----\n");
                    for (Estudante estudante : CadastraEstudante.estudantes) {
                        if (estudante.getTotalAtendimentosPedagogicos() > 0) {
                            System.out.println("Código: " + estudante.getCodigoIdentificador() + " Nome: "
                                    + estudante.getNome() + " CPF: " + estudante.getCpf() + " Numero de atendimentos: "
                                    + estudante.getTotalAtendimentosPedagogicos() + "\n");
                            aux = true;
                        }
                    }
                    if (aux == false) {
                        System.out.println("Nenhum estudante para listar nessa categoria!\n");
                    }

                    b = false;
                    break;

                case 4:
                    System.out.println("-----Pedagogos com mais atendimentos pedagógicos-----\n");
                    for (Pedagogo pedagogo : CadastraPedagogo.pedagogos) {
                        if (pedagogo.getTotalAtendimentosPedagogicos() > 0) {
                            System.out.println("Código: " + pedagogo.getCodigoIdentificador() + " Nome: "
                                    + pedagogo.getNome() + " CPF: " + pedagogo.getCpf() + " Numero de atendimentos: "
                                    + pedagogo.getTotalAtendimentosPedagogicos() + "\n");
                            aux = true;
                        }
                    }
                    if (aux == false) {
                        System.out.println("Nenhum pedagogo para listar nessa categoria!\n");
                    }

                    b = false;
                    break;

                default:
                    System.out.println("Opção inválida\n");
                    break;

            }
        }
    }
}
