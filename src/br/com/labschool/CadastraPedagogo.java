package br.com.labschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraPedagogo {

    static List<Pedagogo> pedagogos = new ArrayList<>();

    public static void cadastraPedagogo() {

        Scanner scan = new Scanner(System.in);
        String status = "";
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
            System.out.println(
                    "\nSelecione o status do Pedagogo:\n 1 - Ativo \n 2 - Inativo \n");
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
        pedagogos.add(new Pedagogo(nome, telefone, dataDeNascimento, cpf, status));
        System.out.println("Professor cadastrado com sucesso!\n");

    }

}
