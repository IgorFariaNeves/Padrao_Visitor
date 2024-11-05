package padroescomportamentais.visitor;

public class EmpresaVisitor implements Visitor {

    @Override
    public String exibirEngenheiro(Engenheiro engenheiro) {
        return "Engenheiro{" +
                "id=" + engenheiro.getId() +
                ", nome='" + engenheiro.getNome() + '\'' +
                ", especialidade='" + engenheiro.getEspecialidade() + '\'' +
                '}';
    }

    @Override
    public String exibirDesigner(Designer designer) {
        return "Designer{" +
                "id=" + designer.getId() +
                ", nome='" + designer.getNome() + '\'' +
                ", estiloPreferido='" + designer.getEstiloPreferido() + '\'' +
                '}';
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "id=" + gerente.getId() +
                ", nome='" + gerente.getNome() + '\'' +
                ", departamento='" + gerente.getDepartamento() + '\'' +
                '}';
    }
}
