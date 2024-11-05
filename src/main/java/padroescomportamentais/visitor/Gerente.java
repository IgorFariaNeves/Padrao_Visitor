package padroescomportamentais.visitor;

public class Gerente implements Funcionario {

    private int id;
    private String nome;
    private String departamento;

    public Gerente(int id, String nome, String departamento) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}
