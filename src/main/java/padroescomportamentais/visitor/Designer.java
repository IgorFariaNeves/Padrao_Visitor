package padroescomportamentais.visitor;

public class Designer implements Funcionario {

    private int id;
    private String nome;
    private String estiloPreferido;

    public Designer(int id, String nome, String estiloPreferido) {
        this.id = id;
        this.nome = nome;
        this.estiloPreferido = estiloPreferido;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstiloPreferido() {
        return estiloPreferido;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDesigner(this);
    }
}
