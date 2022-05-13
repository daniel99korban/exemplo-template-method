package templates;
/**
 * @author Daniel_Korban
 */
public abstract class Relatorio {
    // todos eles contêm cabeçalho, corpo, e rodapé.
    // Método esqueleto
    public final void exibirRelatorio(){
        this.tipoRelatorio();
        this.cabecalho();
        this.corpo();
        this.rodape();
        System.out.println("=========================");
    }
    
    protected abstract void tipoRelatorio();
    protected abstract void cabecalho();
    protected abstract void corpo();
    protected abstract void rodape();
    
}
