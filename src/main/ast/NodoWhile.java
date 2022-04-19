package main.ast;

import java.util.List;

public class NodoWhile extends NodoSentencia {
    private final NodoCondicion condicion;
    private final List<NodoSentencia> cuerpo;
  

    public NodoWhile(NodoCondicion condicion, List<NodoSentencia> cuerpo) {
        super("WHILE");
        this.condicion = condicion;
        this.cuerpo = cuerpo;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        resultado.append(super.graficar(idPadre));

        // Grafica la condición colgando directamente del nodo CUERPO
        resultado.append(condicion.graficar(miId));

        // Agrega un nodo ficticio CUERPO colgando del nodo WHILE
        Nodo nodoCuerpo = new Nodo("Cuerpo");
        resultado.append(nodoCuerpo.graficar(miId));

		String idNodoCuerpo = nodoCuerpo.getIdNodo();
        for (NodoSentencia sentencia: cuerpo) {
            resultado.append(sentencia.graficar(idNodoCuerpo));
        }
        return resultado.toString();
    }
}


