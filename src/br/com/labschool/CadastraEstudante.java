package br.com.labschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraEstudante {

    static List<Estudante> estudantes = new ArrayList<>();

    public static void cadastraEstudante() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("\nTelefone: ");
        String telefone = scan.nextLine();
        System.out.print("\nData de nascimento: ");
        String dataDeNascimento = scan.nextLine();
        System.out.print("\nCPF: ");
        String cpf = scan.nextLine();
        System.out.print("\nNota do processo seletivo: ");
        double nota = scan.nextDouble();
        String status = "";
        boolean n = true;

        while (n) {
            System.out.println(
                    "\nSelecione o status do Estudante:\n 1 - Ativo \n 2 - Irregular \n 3 - Atendimento pedagógico \n 4 - Inativo\n");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    status = "Ativo";
                    n = false;
                    break;
                case 2:
                    status = "Irregular";
                    n = false;
                    break;
                case 3:
                    status = "Atendimento pedagógico";
                    n = false;
                    break;
                case 4:
                    status = "Inativo";
                    n = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        estudantes.add(new Estudante(nome, telefone, dataDeNascimento, cpf, status, nota));
        System.out.println("Estudante cadastrado com sucesso!\n");
    }

}
