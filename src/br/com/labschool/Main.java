package br.com.labschool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean b = true;

        while (b) {
            System.out.println(
                    "\nLab School Menu \n Escolha a operação que deseja efetuar \n 1 - Cadastro de Estudante \n 2 - Cadastro de Professor \n 3 - Cadastro de Pedagogo \n 4 - Cadastro de atendimento pedagógico \n 5 - Listar pessoas cadastradas \n 6 - Relatórios \n 7 - Sair");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    CadastraEstudante.cadastraEstudante();
                    break;
                case 2:
                    CadastraProfessor.cadastraProfessor();
                    break;
                case 3:
                    CadastraPedagogo.cadastraPedagogo();
                    break;
                case 4:
                    Pedagogo.cadastradoAtendimentoPedagogico();
                    Estudante.cadastradoAtendimentoPedagogico();
                    break;
                case 5:
                    ListarPessoa.listarPessoa();
                    break;
                case 6:
                    Relatorios.relatorios();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    System.out.println("Sistema encerrado!");
                    b = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scan.close();

    }
}
