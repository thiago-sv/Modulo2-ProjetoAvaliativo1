package br.com.labschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraProfessor {

    static List<Professor> professores = new ArrayList<>();

    public static void cadastraProfessor() {
        Scanner scan = new Scanner(System.in);
        String status = "";
        String formacaoAcademica = "";
        String experiencia = "";
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("\nTelefone: ");
        String telefone = scan.nextLine();
        System.out.print("\nData de nascimento: ");
        String dataDeNascimento = scan.nextLine();
        System.out.print("\nCPF: ");
        String cpf = scan.nextLine();
        boolean b = true;

        while (b) {
            System.out.print(
                    "Escolha a opção de acordo com a formação acadêmica do professor:\n 1 - Graduação incompleta \n 2 - Graduação completa \n 3 - Mestrado \n 4 - Doutorado \n");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    formacaoAcademica = "Graduação incompleta";
                    b = false;
                    break;
                case 2:
                    formacaoAcademica = "Graduação completa";
                    b = false;
                    break;
                case 3:
                    formacaoAcademica = "Mestrado";
                    b = false;
                    break;
                case 4:
                    formacaoAcademica = "Doutorado";
                    b = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        b = true;
        while (b) {
            System.out.print(
                    "Escolha a opção de acordo com a experiência em desenvolvimento do professor:\n 1 - Front-End \n 2 - Back-End \n 3 - Full-Stack \n");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    experiencia = "Front-End";
                    b = false;
                    break;
                case 2:
                    experiencia = "Back-End";
                    b = false;
                    break;
                case 3:
                    experiencia = "Full-Stack";
                    b = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        b = true;

        while (b) {
            System.out.println(
                    "\nSelecione o status do Professor:\n 1 - Ativo \n 2 - Inativo \n");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    status = "Ativo";
                    b = false;
                    break;
                case 2:
                    status = "Inativo";
                    b = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        professores.add(new Professor(nome, telefone, dataDeNascimento, cpf, formacaoAcademica, experiencia, status));
        System.out.println("Professor cadastrado com sucesso!\n");
    }

}
