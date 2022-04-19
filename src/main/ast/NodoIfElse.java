package main.ast;

import java.util.List;

public class NodoIfElse extends NodoIfGenerico {
    private final NodoCondicion condicion;
    private final List<NodoSentencia> sentencias;
    private final List<NodoSentencia> sentenciaselse;

    public NodoIfElse(NodoCondicion condicion, List<NodoSentencia> sentencias, List<NodoSentencia> sentenciaselse) {
        super("IF");
        this.condicion = condicion;
        this.sentencias = sentencias;
        this.sentenciaselse = sentenciaselse;
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

        Nodo nodoElse = new Nodo("Else");
        resultado.append(nodoElse.graficar(miId));

		String idNodoElse = nodoElse.getIdNodo();
        for (NodoSentencia sentencia: sentenciaselse) {
            resultado.append(sentencia.graficar(idNodoElse));
        }
        return resultado.toString();
    }
}
