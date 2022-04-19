package main.ast;

import java.util.List;

public class NodoIf extends NodoIfGenerico {
    private final NodoCondicion condicion;
    private final List<NodoSentencia> sentencias;

    public NodoIf(NodoCondicion condicion, List<NodoSentencia> sentencias) {
        super("IF");
        this.condicion = condicion;
        this.sentencias = sentencias;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        resultado.append(super.graficar(idPadre));

        resultado.append(condicion.graficar(miId));

        Nodo nodoThen = new Nodo("Then");
        resultado.append(nodoThen.graficar(miId));

		String idNodoThen = nodoThen.getIdNodo();
        for (NodoSentencia sentencia: sentencias) {
            resultado.append(sentencia.graficar(idNodoThen));
        }
        return resultado.toString();
    }
}
