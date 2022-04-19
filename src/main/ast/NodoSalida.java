package main.ast;

public class NodoSalida extends NodoSentencia {
    private final NodoCteString cs;
    
    public NodoSalida(NodoCteString cs) {
        super("PRINT");
        this.cs = cs;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                cs.graficar(miId);
    }
}
