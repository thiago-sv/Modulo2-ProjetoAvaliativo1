package br.com.labschool;

/**
 * Classe que representa uma pessoa da escola Lab School.
 *
 * @author Thiago-sv
 * @version 0.1
 */

public class Pessoa {

    protected String nome;
    protected String telefone;
    protected String dataDeNascimento;
    protected String cpf;
    private static int numeroIdentificador = 0;
    private int codigoIdentificador = 0;

    public Pessoa(String nome, String telefone, String dataDeNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        Pessoa.numeroIdentificador++;
        this.codigoIdentificador = Pessoa.numeroIdentificador;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
