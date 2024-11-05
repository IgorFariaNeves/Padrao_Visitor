package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpresaVisitorTest {

    @Test
    void deveExibirEngenheiro() {
        Engenheiro engenheiro = new Engenheiro(1, "Alice", "Software");

        EmpresaVisitor visitor = new EmpresaVisitor();
        assertEquals("Engenheiro{id=1, nome='Alice', especialidade='Software'}", visitor.exibirEngenheiro(engenheiro));
    }

    @Test
    void deveExibirDesigner() {
        Designer designer = new Designer(2, "Bob", "Minimalista");

        EmpresaVisitor visitor = new EmpresaVisitor();
        assertEquals("Designer{id=2, nome='Bob', estiloPreferido='Minimalista'}", visitor.exibirDesigner(designer));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente(3, "Carol", "Recursos Humanos");

        EmpresaVisitor visitor = new EmpresaVisitor();
        assertEquals("Gerente{id=3, nome='Carol', departamento='Recursos Humanos'}", visitor.exibirGerente(gerente));
    }
}
