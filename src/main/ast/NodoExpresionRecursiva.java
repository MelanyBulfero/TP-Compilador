package main.ast;

import java.util.List;

public class NodoExpresionRecursiva extends NodoExpresion {
    private final List<NodoExpresion> lista;
    private final NodoExpresion expresion;

    public NodoExpresionRecursiva(List<NodoExpresion> lista, String nombre, NodoExpresion expresion) {
        super(nombre);
        this.lista = lista;
        this.expresion = expresion;
    }

	@Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        if (lista.size() >= 1) {
            NodoExpresion expresionhijo = lista.get(lista.size()-1);
            lista.remove(lista.size()-1);
            Nodo nodoRecursivo = new NodoExpresionRecursiva(lista, "+", expresionhijo);
            return super.graficar(idPadre) +
            		nodoRecursivo.graficar(miId) +
            		expresion.graficar(miId);
        } else {
        	return expresion.graficar(idPadre);
        }
    }
}
