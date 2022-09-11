package br.com.labschool;

import java.util.Scanner;

public class Estudante extends Pessoa {

    private String status;
    private double nota;
    private int totalAtendimentosPedagogicos = 0;

    public Estudante(String nome, String telefone, String dataDeNascimento, String cpf, String status, double nota) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.status = status;
        this.nota = nota;
    }

    public int getTotalAtendimentosPedagogicos() {
        return totalAtendimentosPedagogicos;
    }

    public void setTotalAtendimentosPedagogicos(int totalAtendimentosPedagogicos) {
        this.totalAtendimentosPedagogicos += totalAtendimentosPedagogicos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void cadastradoAtendimentoPedagogico() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do estudante que foi atendido");
        String nomeEstudante = scan.nextLine();

        for (Estudante estudante : CadastraEstudante.estudantes) {
            if (estudante.getNome().equals(nomeEstudante)) {
                estudante.setTotalAtendimentosPedagogicos(1);
            }
        }
    }

}
