package main.ast;

import java.util.List;

public class NodoAvg extends NodoExpresion {
    private final List<NodoExpresion> lista;
  

    public NodoAvg(List<NodoExpresion> lista) {
        super("AVG");
        this.lista = lista;
    }

    @Override
    protected String graficar(String idPadre) {
//        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

//        resultado.append(super.graficar(idPadre));

//        Agrega un nodo ficticio /
        Nodo nodoDivision = new Nodo("/");
        resultado.append(nodoDivision.graficar(idPadre));
		String idNodoDivision = nodoDivision.getIdNodo();
		
		int listSize = lista.size();

        NodoExpresion expresion = lista.get(listSize-1);
        lista.remove(listSize-1);
    	Nodo nodoRecursivo = new NodoExpresionRecursiva(lista, "+", expresion);
        resultado.append(nodoRecursivo.graficar(idNodoDivision));

		NodoCteInt nodoDivisor = new NodoCteInt(listSize);
        resultado.append(nodoDivisor.graficar(idNodoDivision));
        return resultado.toString();
    }
}


