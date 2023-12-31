package modelo;

/**
 *
 * @author GLAUFER
 */
public class Aluno {
    private Integer idAluno;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Aluno() {
        endereco = new Endereco();
    }

    public Aluno(Integer idAluno, String nome, String cpf, Endereco endereco) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "idAluno: " + idAluno + ", nome: " + nome + ", cpf: " + cpf + '}';
    }
    
                            
}
