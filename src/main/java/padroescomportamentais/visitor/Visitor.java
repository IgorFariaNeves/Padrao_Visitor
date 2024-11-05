package padroescomportamentais.visitor;

public interface Visitor {

    String exibirEngenheiro(Engenheiro engenheiro);
    String exibirDesigner(Designer designer);
    String exibirGerente(Gerente gerente);

}
