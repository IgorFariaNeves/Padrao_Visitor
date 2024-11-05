package padroescomportamentais.visitor;

public class Engenheiro implements Funcionario {

    private int id;
    private String nome;
    private String especialidade;

    public Engenheiro(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEngenheiro(this);
    }
}
