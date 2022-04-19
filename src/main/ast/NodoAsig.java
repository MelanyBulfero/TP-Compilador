package main.ast;

public class NodoAsig extends NodoSentencia {
    private final NodoVarId id;
    private final NodoExpresion expresion;

    public NodoAsig(NodoVarId id, NodoExpresion expresion) {
        super(":=");
        this.id = id;
        this.expresion = expresion;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
        		id.graficar(miId) +
                expresion.graficar(miId);
    }
}
