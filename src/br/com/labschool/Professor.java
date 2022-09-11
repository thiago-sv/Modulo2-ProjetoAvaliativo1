package br.com.labschool;

public class Professor extends Pessoa {

    private String formacaoAcademica;
    private String experiencia;
    private String status;

    public Professor(String nome, String telefone, String dataDeNascimento, String cpf, String formacaoAcademica,
            String experiencia, String status) {
        super(nome, telefone, dataDeNascimento, cpf);
        this.formacaoAcademica = formacaoAcademica;
        this.experiencia = experiencia;
        this.status = status;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
