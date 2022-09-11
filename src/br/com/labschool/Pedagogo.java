package br.com.labschool;

import java.util.Scanner;

public class Pedagogo extends Pessoa {

    private int totalAtendimentosPedagogicos = 0;
    private String status;

    public Pedagogo(String nome, String telefone, String dataDeNascimento, String cpf, String status) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.status = status;
    }

    public int getTotalAtendimentosPedagogicos() {
        return totalAtendimentosPedagogicos;
    }

    public void setTotalAtendimentosPedagogicos(int totalAtendimentosPedagogicos) {
        this.totalAtendimentosPedagogicos += totalAtendimentosPedagogicos;
    }

    public static void cadastradoAtendimentoPedagogico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do pedagogo responsável pelo atendimento");
        String nomePedagogo = scanner.nextLine();

        for (Pedagogo pedagogo : CadastraPedagogo.pedagogos) {
            if (pedagogo.getNome().equals(nomePedagogo)) {
                pedagogo.setTotalAtendimentosPedagogicos(1);
            }
        }
    }

}
